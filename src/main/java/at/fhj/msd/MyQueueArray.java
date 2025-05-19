package at.fhj.msd;

/**
 * Eine einfache Queue (Warteschlange), die ein Array benutzt.
 *
 * @param <E> der Typ der Elemente in der Queue
 */
public class MyQueueArray<E> {
    private E[] data;
    private int front;
    private int rear;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    // Konstruktor: erstellt ein leeres Array
    @SuppressWarnings("unchecked")
    public MyQueueArray() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Gibt die Anzahl der Elemente zurück
    public int size() {
        return size;
    }

    // Gibt true zurück, wenn die Queue leer ist
    public boolean isEmpty() {
        return size == 0;
    }

    // Fügt ein neues Element hinten in die Queue
    public void put(E element) {
        if (size == data.length) {
            resize(2 * data.length); // Vergrößert das Array bei Bedarf
        }
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }

    // Holt das vorderste Element und entfernt es
    public E get() {
        if (isEmpty()) return null;
        E element = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return element;
    }

    // Hilfsmethode zum Vergrößern des Arrays
    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
        rear = size;
    }
}

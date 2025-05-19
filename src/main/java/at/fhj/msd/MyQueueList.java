package at.fhj.msd;

/**
 * Eine einfache Queue (Warteschlange), die eine verkettete Liste benutzt.
 *
 * @param <E> der Typ der Elemente in der Queue
 */
public class MyQueueList<E> {

    // Interner Knoten für die Liste
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    private Node<E> front;
    private Node<E> rear;
    private int size;

    // Konstruktor: erstellt eine leere Queue
    public MyQueueList() {
        front = rear = null;
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
        Node<E> newNode = new Node<>(element);
        if (rear != null) {
            rear.next = newNode;
        } else {
            front = newNode;
        }
        rear = newNode;
        size++;
    }

    // Holt das erste Element und entfernt es
    public E get() {
        if (isEmpty()) return null;
        E element = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return element;
    }
}

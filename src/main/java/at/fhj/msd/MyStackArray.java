package at.fhj.msd;
/**
 * Eine generische Stack-Implementierung basierend auf einem Array.
 *
 * @param <E> der Typ der gespeicherten Elemente
 */
public class MyStackArray<E> {
    private E[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    /**
     * Erstellt einen leeren Stack mit einer Anfangskapazität.
     */
    @SuppressWarnings("unchecked")
    public MyStackArray() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    /**
     * Gibt die Anzahl der Elemente im Stack zurück.
     *
     * @return Anzahl der Elemente
     */
    public int size() {
        return size;
    }

    /**
     * Prüft, ob der Stack leer ist.
     *
     * @return true, wenn der Stack leer ist, sonst false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Legt ein neues Element auf den Stack.
     *
     * @param element das hinzuzufügende Element
     */
    public void push(E element) {
        if (size == data.length) {
            resize(2 * data.length);
        }
        data[size++] = element;
    }

    /**
     * Entfernt das oberste Element vom Stack und gibt es zurück.
     *
     * @return das oberste Element oder null, wenn der Stack leer ist
     */
    public E pop() {
        if (isEmpty()) return null;
        E element = data[--size];
        data[size] = null; // Speicherbereinigung
        return element;
    }

    /**
     * Interne Hilfsmethode zum Vergrößern des Arrays.
     *
     * @param newCapacity neue Kapazität des Arrays
     */
    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}

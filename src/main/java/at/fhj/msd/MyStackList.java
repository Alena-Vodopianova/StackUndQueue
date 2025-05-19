package at.fhj.msd;
/**
 * Eine generische Stack-Implementierung basierend auf einer einfach verketteten Liste.
 *
 * @param <E> der Typ der gespeicherten Elemente
 */
public class MyStackList<E> {

    /**
     * Interner Knoten zur Speicherung der Elemente.
     */
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    private Node<E> top;  // Oberstes Element im Stack
    private int size;

    /**
     * Erstellt einen leeren Stack.
     */
    public MyStackList() {
        top = null;
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
     * @return true, wenn leer, sonst false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Legt ein neues Element oben auf den Stack.
     *
     * @param element das hinzuzufügende Element
     */
    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    /**
     * Entfernt und gibt das oberste Element vom Stack zurück.
     *
     * @return das oberste Element oder null, wenn der Stack leer ist
     */
    public E pop() {
        if (isEmpty()) return null;
        E element = top.data;
        top = top.next;
        size--;
        return element;
    }
}

package at.fhj.msd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testklasse für die MyStackArray-Implementierung.
 */
public class MyStackArrayTest {
    private MyStackArray<Integer> stack;

    /**
     * Initialisiert einen neuen Stack vor jedem Test.
     */
    @Before
    public void setUp() {
        stack = new MyStackArray<>();
    }

    /**
     * Testet size() und isEmpty() für einen leeren Stack.
     */
    @Test
    public void testEmptyStack() {
        assertTrue("Stack sollte leer sein", stack.isEmpty());
        assertEquals("Größe sollte 0 sein", 0, stack.size());
    }

    /**
     * Testet push() und size() für das Hinzufügen von Elementen.
     */
    @Test
    public void testPushAndSize() {
        stack.push(1);
        assertFalse("Stack sollte nicht leer sein", stack.isEmpty());
        assertEquals("Größe sollte 1 sein", 1, stack.size());

        stack.push(2);
        assertEquals("Größe sollte 2 sein", 2, stack.size());
    }

    /**
     * Testet pop() für das Entfernen von Elementen und LIFO-Verhalten.
     */
    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        assertEquals("Oberstes Element sollte 2 sein", Integer.valueOf(2), stack.pop());
        assertEquals("Größe sollte 1 sein", 1, stack.size());
        assertEquals("Oberstes Element sollte 1 sein", Integer.valueOf(1), stack.pop());
        assertTrue("Stack sollte leer sein", stack.isEmpty());
    }

    /**
     * Testet pop() für einen leeren Stack.
     */
    @Test
    public void testPopEmpty() {
        assertNull("Pop auf leerem Stack sollte null zurückgeben", stack.pop());
        assertTrue("Stack sollte leer bleiben", stack.isEmpty());
    }

    /**
     * Testet das Hinzufügen von mehr Elementen als die Anfangskapazität.
     */
    @Test
    public void testResize() {
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals("Größe sollte 15 sein", 15, stack.size());
        assertEquals("Oberstes Element sollte 14 sein", Integer.valueOf(14), stack.pop());
    }

    /**
     * Testet eine Sequenz von push und pop Operationen.
     */
    @Test
    public void testPushPopSequence() {
        stack.push(1);
        stack.push(2);
        stack.pop(); // Entfernt 2
        stack.push(3);
        assertEquals("Größe sollte 2 sein", 2, stack.size());
        assertEquals("Oberstes Element sollte 3 sein", Integer.valueOf(3), stack.pop());
        assertEquals("Nächstes Element sollte 1 sein", Integer.valueOf(1), stack.pop());
        assertTrue("Stack sollte leer sein", stack.isEmpty());
    }
}
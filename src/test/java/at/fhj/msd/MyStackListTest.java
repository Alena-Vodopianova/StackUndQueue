package at.fhj.msd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Testklasse für die MyStackList-Implementierung.
 */
public class MyStackListTest {

    private MyStackList<Integer> stack;

    /**
     * Initialisiert einen neuen Stack vor jedem Test.
     */
    @Before
    public void setUp() {
        stack = new MyStackList<>();
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

    /**
     * Testet das Hinzufügen einer großen Anzahl von Elementen.
     */
    @Test
    public void testLargeStack() {
        for (int i = 0; i < 1000; i++) {
            stack.push(i);
        }
        assertEquals("Größe sollte 1000 sein", 1000, stack.size());
        assertEquals("Oberstes Element sollte 999 sein", Integer.valueOf(999), stack.pop());
    }
}

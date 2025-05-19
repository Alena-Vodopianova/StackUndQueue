package at.fhj.msd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Testklasse für die MyQueueList-Implementierung.
 */
public class MyQueueListTest {

    private MyQueueList<Integer> queue;

    @Before
    public void setUp() {
        queue = new MyQueueList<>();
    }

    // Testet eine leere Queue
    @Test
    public void testEmptyQueue() {
        assertTrue("Queue sollte leer sein", queue.isEmpty());
        assertEquals("Größe sollte 0 sein", 0, queue.size());
    }

    // Testet put() und size()
    @Test
    public void testPutAndSize() {
        queue.put(10);
        queue.put(20);
        assertFalse("Queue sollte nicht leer sein", queue.isEmpty());
        assertEquals("Größe sollte 2 sein", 2, queue.size());
    }

    // Testet get() und FIFO-Verhalten
    @Test
    public void testGet() {
        queue.put(5);
        queue.put(6);
        assertEquals("Erstes Element sollte 5 sein", Integer.valueOf(5), queue.get());
        assertEquals("Zweites Element sollte 6 sein", Integer.valueOf(6), queue.get());
        assertTrue("Queue sollte leer sein", queue.isEmpty());
    }

    // Testet get() bei leerer Queue
    @Test
    public void testGetEmpty() {
        assertNull("Get auf leerer Queue sollte null sein", queue.get());
    }

    // Testet mehrere put/get Aufrufe
    @Test
    public void testPutGetSequence() {
        queue.put(1);
        queue.put(2);
        queue.get(); // 1
        queue.put(3);
        assertEquals("Erwartet 2", Integer.valueOf(2), queue.get());
        assertEquals("Erwartet 3", Integer.valueOf(3), queue.get());
        assertTrue("Queue sollte leer sein", queue.isEmpty());
    }
}

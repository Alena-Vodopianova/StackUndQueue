package at.fhj.msd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Testklasse für die MyQueueArray-Implementierung.
 */
public class MyQueueArrayTest {

    private MyQueueArray<Integer> queue;

    @Before
    public void setUp() {
        queue = new MyQueueArray<>();
    }

    @Test
    public void testEmptyQueue() {
        assertTrue("Queue sollte leer sein", queue.isEmpty());
        assertEquals("Größe sollte 0 sein", 0, queue.size());
    }

    @Test
    public void testPutAndSize() {
        queue.put(1);
        queue.put(2);
        assertFalse("Queue sollte nicht leer sein", queue.isEmpty());
        assertEquals("Größe sollte 2 sein", 2, queue.size());
    }

    @Test
    public void testGet() {
        queue.put(1);
        queue.put(2);
        assertEquals("Erstes Element sollte 1 sein", Integer.valueOf(1), queue.get());
        assertEquals("Zweites Element sollte 2 sein", Integer.valueOf(2), queue.get());
        assertTrue("Queue sollte leer sein", queue.isEmpty());
    }

    @Test
    public void testGetEmpty() {
        assertNull("Get auf leerer Queue sollte null sein", queue.get());
    }

    @Test
    public void testResize() {
        for (int i = 0; i < 15; i++) {
            queue.put(i);
        }
        assertEquals("Größe sollte 15 sein", 15, queue.size());
        assertEquals("Erstes Element sollte 0 sein", Integer.valueOf(0), queue.get());
    }
}

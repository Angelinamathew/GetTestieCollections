package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeueTest {
    @Test
    public void testDequeueAdd(){
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Testing");
        queue.add("Queue");

        Assert.assertFalse(queue.isEmpty());
    }
    @Test
    public void testDequeueRemove(){
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Testing");
        queue.add("Queue");
        queue.remove("Queue");

        Assert.assertFalse(queue.contains("Queue"));
    }
    @Test
    public void testDequeueIsEmpty(){
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Testing");
        queue.add("Queue");
        queue.remove("Queue");

        Assert.assertFalse(queue.isEmpty());
    }
    @Test
    public void testDequeueSize(){
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Testing");
        queue.add("Queue");
        queue.add("!");
        Assert.assertEquals(3, queue.size());

    }
    @Test
    public void testDequeueGetLast(){
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Testing");
        queue.add("Queue");
        queue.add("!");

        Assert.assertEquals("!", queue.getLast());
    }
    @Test
    public void testDequeueGetFirst(){
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Testing");
        queue.add("Queue");
        queue.add("!");

        Assert.assertEquals("Testing", queue.getFirst());
    }


}

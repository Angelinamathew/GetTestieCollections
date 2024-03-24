package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    @Test
    public void testQueuePush(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Testing");
        Assert.assertEquals("Testing", queue.peek());
    }
    @Test
    public void testQueuePop(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Testing");
        queue.push("Queue");
        queue.push("!");
        Assert.assertEquals("!", queue.peek());
    }
    @Test
    public void testQueueIsEmpty(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Testing");
        Assert.assertFalse(queue.isEmpty());
    }
    @Test
    public void testQueueAddLast(){
        LinkedList<String> queue = new LinkedList<>();
        queue.push("Testing");
        queue.push("Queue");
        queue.addLast("!");
        Assert.assertEquals("!", queue.peekLast());
    }
}

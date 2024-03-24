package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    @Test
    public void testPriorityQueueAdd(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Testing");
        priorityQueue.add("Priority");
        priorityQueue.add("Queue");
        Assert.assertFalse(priorityQueue.isEmpty());
    }
    @Test
    public void testPriorityQueueRemove(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Testing");
        priorityQueue.add("Priority");
        priorityQueue.add("Queue");
        priorityQueue.remove();
        Assert.assertEquals("Queue",priorityQueue.peek());
    }
    @Test
    public void testPriorityQueueContains(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Testing");
        priorityQueue.add("Priority");
        priorityQueue.add("Queue");
        Assert.assertTrue(priorityQueue.contains("Queue"));
    }
    @Test
    public void testPriorityQueueIsEmpty(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Testing");
        priorityQueue.add("Priority");
        priorityQueue.add("Queue");
        priorityQueue.remove();
        priorityQueue.remove();
        priorityQueue.remove();
        Assert.assertTrue(priorityQueue.isEmpty());
    }
}

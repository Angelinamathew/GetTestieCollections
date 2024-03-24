package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void testLinkedListAdd(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Testing");
        list.add("Linked");
        list.add("List");
        Assert.assertFalse(list.isEmpty());
    }
    @Test
    public void testLinkedListRemove(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Testing");
        list.add("Linked");
        list.add("List");
        list.remove();
        Assert.assertFalse(list.contains("Testing"));
    }
}

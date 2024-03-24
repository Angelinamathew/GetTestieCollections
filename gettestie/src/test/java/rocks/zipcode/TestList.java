package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    @Test
    public void testListAdd() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        Assert.assertEquals("List",list.get(1));
    }
    @Test
    public void testListRemove() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        Assert.assertTrue(list.remove("List"));
    }
    @Test
    public void testListIsEmpty() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        Assert.assertFalse(list.isEmpty());
    }
    @Test
    public void testListContains() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        Assert.assertTrue(list.contains("List"));
    }
    @Test
    public void testListIndexOf() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        Assert.assertEquals(1,list.indexOf("List"));
    }
    @Test
    public void testListGet() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        Assert.assertEquals("Testing",list.get(0));
    }
    @Test
    public void testListSize() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        Assert.assertEquals(2,list.size());
    }
}

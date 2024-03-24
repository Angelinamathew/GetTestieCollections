package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IteratorTest {
    @Test
    public void testListAdd() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        Iterator<String> iterator = list.iterator();
        assertEquals(true, iterator.hasNext());
    }
    @Test
    public void testListIt() {
        List<String> list = new ArrayList<>() ;
        list.add("Testing");
        list.add("List");
        list.add("!");
        Iterator<String> iterator = list.iterator();
        assertEquals("Testing", iterator.next());
        assertEquals("List", iterator.next());
    }
}

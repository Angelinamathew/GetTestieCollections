package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    @Test
    public void vectorAdd() {
        Vector<String> vector = new Vector<>();
        vector.add("Testing");
        vector.add("Vector");
        Assert.assertFalse(vector.isEmpty());
    }
    @Test
    public void vectorAdd2() {
        Vector<String> vector = new Vector<>();
        vector.add("Testing");
        vector.add("Vector");
        vector.add(2, "!");
        Assert.assertEquals("!", vector.elementAt(2));
    }
    @Test
    public void vectorIsEmpty() {
        Vector<String> vector = new Vector<>();
        vector.add("Testing");
        vector.add("Vector");
        vector.add(2, "!");
        Assert.assertFalse(vector.isEmpty());
    }
    @Test
    public void vectorSize() {
        Vector<String> vector = new Vector<>();
        vector.add("Testing");
        vector.add("Vector");
        vector.add(2, "!");
        Assert.assertEquals(3, vector.size());
    }
    @Test
    public void vectorContains() {
        Vector<String> vector = new Vector<>();
        vector.add("Testing");
        vector.add("Vector");
        vector.add(2, "!");
        Assert.assertTrue(vector.contains("!"));
    }

}

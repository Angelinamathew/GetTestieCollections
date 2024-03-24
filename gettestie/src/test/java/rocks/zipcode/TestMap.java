package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestMap {
    @Test
    public void testMapAdd(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");

        Assert.assertFalse(hashMap.isEmpty());
    }
    @Test
    public void testMapRemove(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.remove(2);

        Assert.assertFalse(hashMap.containsKey(2));
    }
    @Test
    public void testMapIsEmpty(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.remove(2);

        Assert.assertFalse(hashMap.isEmpty());
    }

    @Test
    public void testMapSize(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        Assert.assertEquals(2, hashMap.size());
    }
}

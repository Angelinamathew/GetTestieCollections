package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    @Test
    public void testSetAdd(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Testing");
        hashSet.add("HashSet");
        Assert.assertFalse(hashSet.isEmpty());
    }
    @Test
    public void testSetRemove(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Testing");
        hashSet.add("HashSet");
        hashSet.remove("HashSet");
        Assert.assertFalse(hashSet.contains("HashSet"));
    }
    @Test
    public void testSetIsEmpty(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Testing");
        hashSet.add("HashSet");
        Assert.assertFalse(hashSet.isEmpty());
    }
    @Test
    public void testSetClear(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Testing");
        hashSet.add("HashSet");
        hashSet.clear();
        Assert.assertTrue(hashSet.isEmpty());
    }
    @Test
    public void testSetSize(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Testing");
        hashSet.add("HashSet");

        Assert.assertEquals(2, hashSet.size());
    }
    @Test
    public void testSetContains(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Testing");
        hashSet.add("HashSet");

        Assert.assertTrue(hashSet.contains("HashSet"));
    }


}

package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class StackTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void testStackPush(){
        Stack<String> stack = new Stack<>();
        stack.push("Testing");

        assertEquals("Testing", stack.peek());
    }
    @Test
    public void testStackPop(){
        Stack<String> stack = new Stack<>();
        stack.push("Testing");
        stack.push("Stack");
        stack.pop();

        assertEquals("Testing", stack.peek());
    }
    @Test
    public void testStackPeek(){
        Stack<String> stack = new Stack<>();
        stack.push("Testing");
        stack.push("Stack");

        assertEquals("Stack", stack.peek());
    }



    // Make a bigger test exercising more Stack methods.....
}

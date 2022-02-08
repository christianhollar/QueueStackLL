

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyStackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyStackTest
{
    /**
     * Default constructor for test class MyStackTest
     */
    public MyStackTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestStack()
    {
        MyStack myStack1 = new MyStack();
        assertEquals(true, myStack1.isEmpty());
        assertEquals(null, myStack1.pop());
        myStack1.push(5);
        myStack1.push(10);
        myStack1.push(25);
        assertEquals(25, myStack1.peek());
        assertEquals(10, myStack1.pop());
    }
}


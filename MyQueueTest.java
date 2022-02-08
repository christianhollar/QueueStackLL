

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyQueueTest
{
    /**
     * Default constructor for test class MyQueueTest
     */
    public MyQueueTest()
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
    public void QueueTest()
    {
        MyQueue myQueue3 = new MyQueue();
        assertEquals(5, myQueue3.add(5));
        assertEquals(10, myQueue3.add(10));
        assertEquals(500, myQueue3.add(500));
        assertEquals(5, myQueue3.peek());
        assertEquals(10, myQueue3.remove());
    }
}


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BetterRectangleTest
{
    /**
     * Default constructor for test class BetterRectangleTest
     */
    public BetterRectangleTest()
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
    public void TestBRectPer()
    {
        BetterRectangle brec = new BetterRectangle();
        assertEquals(brec.getPerimeter(),120.0);
    }
    
    @Test
    public void TestBRectAre()
    {
        BetterRectangle brec = new BetterRectangle();
        assertEquals(800.0,brec.getArea());
    }
}

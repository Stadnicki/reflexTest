package reflextest;

import java.awt.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class ModelTest {
    
    public ModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of clearTimesArr method, of class Model.
     */
    @Test
    public void testClearTimesArr() 
    {
        System.out.println("testing clearTimesArr");
        Model instance = new Model();
        instance.clearTimesArr();
        int temp = instance.resList.size();
        assertEquals(temp, 0);
    }

    /**
     * Test of getRandomTime method, of class Model.
     */
    @Test
    public void testGetRandomTime() 
    {
        System.out.println("testing getRandomTime");
        Model instance = new Model();
        int result = instance.getRandomTime();
        assertTrue(result > 0 && result < 10000);
    }

    /**
     * Test of setStartTime method, of class Model.
     */
    @Test
    public void testSetStartTime() 
    {
        long temp = System.nanoTime();
        System.out.println("testing setStartTime");
        Model instance = new Model();
        instance.setStartTime();
        assertTrue(instance.startTime > temp);
    }

    /**
     * Test of setStopTime method, of class Model.
     */
    @Test
    public void testSetStopTime() {
        System.out.println("testing setStopTime");
        Model instance = new Model();
        instance.setStopTime();
        assertTrue(instance.startTime < instance.stopTime);
    }

    /**
     * Test of getPoint method, of class Model.
     */
    @Test
    public void testGetPoint() {
        System.out.println("testing getPoint");
        Model instance = new Model();
        Point result = instance.getPoint();
        assertTrue(result.x <= 1366 && result.x >= 0 && result.y <= 768 && result.y >= 0);
    }

    /**
     * Test of setGetAverage method, of class Model.
     */
    @Test
    public void testSetGetAverage() {
        System.out.println("testig setGetAverage");
        Model instance = new Model();
        instance.setStartTime();
        instance.setStopTime();
        long result = instance.setGetAverage();
        assertEquals(result, instance.sumTime/instance.resList.size());
    }
}

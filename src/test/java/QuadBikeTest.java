import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quad;

    @Before
    public void before(){
        quad = new QuadBike(120,1000);
    }

    @Test
    public void hasEngine(){
        assertEquals(1000, quad.getEngine());
    }

    @Test
    public void hasAvgSpeed(){
        assertEquals(120, quad.getAvgSpeed());
    }

    @Test
    public void hasTravelTime(){
        assertEquals(10, quad.driveDistance(1200));
    }



}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DodgemCarTest{

    DodgemCar dodge;

    @Before
    public void before(){
        dodge = new DodgemCar(4,150);
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(4, dodge.getNumberOfSeats());
    }

    @Test
    public void hasAvgSpeed(){
        assertEquals(150, dodge.getAvgSpeed());
    }

    @Test
    public void hasTravelTime(){
        assertEquals(10, dodge.driveDistance(1500));
    }






}

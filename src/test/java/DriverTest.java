import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    DodgemCar dodge;

    @Before
    public void before() {
        dodge = new DodgemCar(4, 150);
        driver = new Driver("Tony", dodge);
    }

    @Test
    public void hasName() {
        assertEquals("Tony", driver.getName());
    }

    @Test
    public void hasVehicle() {
        assertEquals(dodge, driver.getVehicle());
    }

    @Test
    public void hasDriveDistance(){
    assertEquals(10, dodge.driveDistance(1500));
    }


    @Test
    public void canSetVehicle(){
        QuadBike quad = new QuadBike(120,1000);
        driver.setVehicle(quad);
        assertEquals(12, driver.driveDistance(1500));


    }





}

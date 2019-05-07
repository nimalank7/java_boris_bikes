package boris_bikes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BikeTest {

    @Test
    public void BikeIsWorking() {
        Bike bike = new Bike();
        assertEquals("Initial bike condition is true", true, bike.getCondition());
    }

}

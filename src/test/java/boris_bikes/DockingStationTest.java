package boris_bikes;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DockingStationTest {

    @Test
    public void CheckBikesArrayListIsEmpty() {
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        ArrayList<Bike> bikes = dockingStation.getBikes();
        assertEquals("Bike array list size should be 0", 0, bikes.size());
    }

    @Test
    public void ReleaseBikeFromDockingStation() {
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        ArrayList<Bike> bikes = dockingStation.getBikes();
        bikes.add(new Bike());
        dockingStation.releaseBike();
        assertEquals("Docking station is now 0 after releasing bike", 0, bikes.size());
    }

}
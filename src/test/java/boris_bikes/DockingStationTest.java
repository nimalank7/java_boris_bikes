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

    @Test
    public void ReturnDockingStationSizeAsOne(){
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        dockingStation.dock_bike(new Bike());
        ArrayList<Bike> bikes = dockingStation.getBikes();
        assertEquals("Docking station size is now 1 after docking bike", 1, bikes.size());
    }

    @Test
    public void ReturnsDockedBike(){
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        Bike bike = new Bike();
        dockingStation.dock_bike(bike);
        assertEquals("Returns the bike that was just docked", bike, dockingStation.dock_bike(bike));
    }
}
package boris_bikes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.*;

public class DockingStationTest {

    @Test
    public void checkBikesArrayListIsEmpty() {
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        ArrayList<Bike> bikes = dockingStation.getBikes();
        assertEquals("Bike array list size should be 0", 0, bikes.size());
    }

    @Test
    public void releaseBikeFromDockingStation() {
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        ArrayList<Bike> bikes = dockingStation.getBikes();
        bikes.add(new Bike());
        dockingStation.releaseBike();
        assertEquals("Docking station is now 0 after releasing bike", 0, bikes.size());
    }

    @Test
    public void returnDockingStationSizeAsOne(){
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        dockingStation.dock_bike(new Bike());
        ArrayList<Bike> bikes = dockingStation.getBikes();
        assertEquals("Docking station size is now 1 after docking bike", 1, bikes.size());
    }

    @Test
    public void returnsDockedBike(){
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        Bike bike = new Bike();
        dockingStation.dock_bike(bike);
        assertEquals("Returns the bike that was just docked", bike, dockingStation.dock_bike(bike));
    }

    @Test
    public void returnsAnEmptyOptionalWhenReleasingBikeWhilstEmpty() {
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        Optional<Bike> no_bike = dockingStation.releaseBike();
        assertEquals("Returns an empty optional when release bike whilst bike arraylist is empty", true, no_bike.isEmpty());
    }

    @Test
    public void returnsABikeOptionalWhenReleasingBike() {
        DockingStation dockingStation = new DockingStation(new ArrayList<Bike>());
        Bike bike = new Bike();
        dockingStation.dock_bike(bike);
        Bike released_bike = dockingStation.releaseBike().get();
        assertEquals("Returns a Bike optional when releasing bike", bike, released_bike);
    }
}
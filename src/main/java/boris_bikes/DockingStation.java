package boris_bikes;

import java.util.ArrayList;

public class DockingStation {

    ArrayList<Bike> bikes;

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }

    public DockingStation(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }

    public Bike releaseBike() {
        return bikes.remove(bikes.size() -1);
    }

    public Bike dock_bike(Bike bike) {
        getBikes().add(bike);
        return bike;
    }
}

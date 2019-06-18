package boris_bikes;

import java.util.ArrayList;
import java.util.Optional;

public class DockingStation {

    ArrayList<Bike> bikes;

    int capacity = 20;

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }

    public DockingStation(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }

    public Optional<Bike> releaseBike() {

        if (isEmpty() == false) {
            Bike bike = bikes.remove(bikes.size() -1);
            return Optional.of(bike);
        }

        return Optional.empty();
    }

    public boolean isEmpty() {
        return getBikes().size() == 0 ? true : false;

    }

    public boolean isLessThanCapacity() {
        return bikes.size() < 20 ? true : false;
    }

    public Bike dock_bike(Bike bike) {
        getBikes().add(bike);
        return bike;
    }
}

import java.util.*;

public class ParkingLot {

    HashMap<String, Integer> parking = new HashMap<>();
    int spot = 1;

    public void park(String vehicle) {
        parking.put(vehicle, spot++);
        System.out.println(vehicle + " parked at " + parking.get(vehicle));
    }

    public void exit(String vehicle) {
        System.out.println(vehicle + " exited from " + parking.get(vehicle));
        parking.remove(vehicle);
    }

    public static void main(String[] args) {
        ParkingLot pl = new ParkingLot();

        pl.park("Jaguar F-Pace");
        pl.exit("Jaguar F-Pace");
    }
}
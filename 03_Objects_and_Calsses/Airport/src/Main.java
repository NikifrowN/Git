import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println("List of all aircrafts: \n" + airport.getAllAircrafts());
        System.out.println("Number of all aircrafts: \n" + airport.getAllAircrafts().size());
    }
}

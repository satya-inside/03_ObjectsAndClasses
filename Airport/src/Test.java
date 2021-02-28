import com.skillbox.airport.Airport;

public class Test {
    public static void main(String[] args) {

        Airport first = Airport.getInstance();
        System.out.println(first.getAllAircrafts());


    }
}

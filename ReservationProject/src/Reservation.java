import java.sql.Time;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 7/1/13
 * Time: 7:48 PM
 * To change this template use File | Settings | File Templates.
 */

public class Reservation {

    public Reservation(String reserver, int numberOfPeople, int timeOfReservation){
        this.reserver = reserver;
        this.numberOfPeople = numberOfPeople;
        this.timeOfReservation = timeOfReservation;
    }

    public  String reserver;
    public int numberOfPeople;
    public int timeOfReservation;

    public String getReserver() {
        return reserver;
    }

    public void setReserver(String reserver) {
        this.reserver = reserver;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getTimeOfReservation() {
        return timeOfReservation;
    }

    public void setTimeOfReservation(int timeOfReservation) {
        this.timeOfReservation = timeOfReservation;
    }

}

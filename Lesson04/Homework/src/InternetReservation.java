import java.util.*;

/**
 * Internet Reservation Class
 */
public class InternetReservation extends Reservation {

    InternetReservation(String reservationName, int reservationSize, int reservationTime, int reservationPhoneNumber, String reservationWebsite){
        super(reservationName, reservationSize, reservationTime);
        this.reservationPhoneNumber = reservationPhoneNumber;
        this.reservationWebsite = reservationWebsite;
    }

    private int reservationPhoneNumber;
    private String reservationWebsite;

    public int getReservationPhoneNumber() {
        return reservationPhoneNumber;
    }

    public void setReservationPhoneNumber(int reservationPhoneNumber) {
        this.reservationPhoneNumber = reservationPhoneNumber;
    }

    public String getReservationWebsite() {
        return reservationWebsite;
    }

    public void setReservationWebsite(String reservationWebsite) {
        this.reservationWebsite = reservationWebsite;
    }

    public void toArray(){
        List reservationArray = new ArrayList();
        reservationArray.add(getReservationName());
        reservationArray.add(getReservationSize());
        reservationArray.add(getReservationTime());
        reservationArray.add(reservationPhoneNumber);
        reservationArray.add(reservationWebsite);
    }
}

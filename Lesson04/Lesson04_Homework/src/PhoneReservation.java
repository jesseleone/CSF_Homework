import java.util.*;

/**
 * Phone reservation class
 */
public class PhoneReservation extends Reservation {

    PhoneReservation(String reservationName, int reservationSize, int reservationTime, int reservationPhoneNumber){
       super(reservationName, reservationSize, reservationTime);
       this.reservationPhoneNumber = reservationPhoneNumber;
    }

    private int reservationPhoneNumber;

    public int getReservationPhoneNumber() {
        return reservationPhoneNumber;
    }

    public void setReservationPhoneNumber(int reservationPhoneNumber) {
        this.reservationPhoneNumber = reservationPhoneNumber;
    }

    public void toArray(){
        List reservationArray = new ArrayList();
        reservationArray.add(getReservationName());
        reservationArray.add(getReservationSize());
        reservationArray.add(getReservationTime());
        reservationArray.add(reservationPhoneNumber);
    }
}

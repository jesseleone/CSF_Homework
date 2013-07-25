import java.util.*;

/**
 * Reservation Class
 */
public class Reservation {

    public Reservation(String reservationName, int reservationSize, int reservationTime){
        this.reservationName = reservationName;
        this.reservationSize = reservationSize;
        this.reservationTime = reservationTime;
    }

    private String reservationName;
    private int reservationSize;
    private int reservationTime;

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public int getReservationSize() {
        return reservationSize;
    }

    public void setReservationSize(int reservationSize) {
        this.reservationSize = reservationSize;
    }

    public int getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(int reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void toArray(){
        List reservationArray = new ArrayList();
        reservationArray.add(reservationName);
        reservationArray.add(reservationTime);
        reservationArray.add(reservationSize);
    }

    public void printReservation(){
        String printedReservation = "Name: " + reservationName + ", Size: " + reservationSize + ", Time: " + reservationTime;
    }
}

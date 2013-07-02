import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 7/1/13
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReservationInterface {

    public ArrayList<Reservation> reservationList = new ArrayList<Reservation>();

    public void takeReservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the party?");
        String reserver = scanner.next();

        System.out.println("How many people in the party?");
        int numberOfPeople = scanner.nextInt();

        System.out.println("What is the time of reservation? (Please input hour as integer)");
        int timeOfReservation = scanner.nextInt();

        Reservation newReservation = new Reservation(reserver, numberOfPeople, timeOfReservation);

        this.reservationList.add(newReservation);
    }

    public void printReservation(){
        System.out.println(reservationList.toString());
    }
}

import java.util.*;

/**
 * Collects info from user
 */
public class Interface {

    //Prompts user for action. Add, Remove, List
    public static void prompt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do? (1)Add, (2)Remove or (3)List");
        String userAction = scanner.next();

        if(userAction.equals("1")){
              addReservation();
        }
        else
        {
            if(userAction.equals("2")){
                removeReservation();
            }
            else
            {
                if(userAction.equals("3")){
                    listReservation();
                }
                else{
                    System.out.println("Sorry, we didn't understand that. Please try again");
                    prompt();
                }
            }
        }

    }

    //Adds reservation. Regular, Phone, or Internet
    public static void addReservation(){
        ArrayList reservationList = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of reservation is it? (1)Regular, (2)Phone or (3)Internet");
        String reservationType = scanner.next();


        if(reservationType.equals("1")){
            System.out.println("What is the last name of the party?");
            String reservationName = scanner.next();
            System.out.println("How many in the party?");
            int reservationSize = scanner.nextInt();
            System.out.println("What time is the reservation?");
            int reservationTime = scanner.nextInt();
            Reservation reservation = new Reservation(reservationName, reservationSize, reservationTime);
            reservation.toArray();
            reservationList.add(reservation);
        } else if(reservationType.equals("2")){
            System.out.println("What is the last name of the party?");
            String reservationName = scanner.next();
            System.out.println("How many in the party?");
            int reservationSize = scanner.nextInt();
            System.out.println("What time is the reservation?");
            int reservationTime = scanner.nextInt();
            System.out.println("What time is the phone number?");
            int reservationPhoneNumber = scanner.nextInt();
            PhoneReservation reservation = new PhoneReservation(reservationName, reservationSize, reservationTime, reservationPhoneNumber);
            reservation.toArray();
            reservationList.add(reservation);
        }
        else if(reservationType.equals("3")){
            System.out.println("What is the last name of the party?");
            String reservationName = scanner.next();
            System.out.println("How many in the party?");
            int reservationSize = scanner.nextInt();
            System.out.println("What time is the reservation?");
            int reservationTime = scanner.nextInt();
            System.out.println("What is the phone number?");
            int reservationPhoneNumber = scanner.nextInt();
            System.out.println("What is the website?");
            String reservationWebsite = scanner.next();
            InternetReservation reservation = new InternetReservation(reservationName, reservationSize, reservationTime, reservationPhoneNumber, reservationWebsite);
            reservation.toArray();
            reservationList.add(reservation);
        }
        else {
            System.out.println("Sorry we didn't understand that");
            addReservation();
        }

        System.out.println("Reservation added. Thank you.");
        prompt();
    }

    //Removes reservation by name and time
    public static void removeReservation(){

        System.out.println("Reservation removed. Thank you.");
        prompt();
    }

    //lists reservations for user
    public static void listReservation(){

        System.out.println();
        prompt();
    }

}

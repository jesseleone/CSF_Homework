/**
 Application for Taking Reservations
 Requirements:

 Each restaurant reservation must have:

 Time (hour granularity is OK, eg. 7pm, 8pm, 9pm)
 Name
 Number of people

 Internet reservation requests must also have:

 Source website
 Phone number
 Time reserved

 Phone reservation requests must also have:

 Phone number

 The system should be able to:

 Accept new reservation requests (of all types: in-person, phone, internet)
 Remove reservations for a specific name/time combination
 List all reservation requests (ordered by reservation time) along with a description. The description should have time, name, number of people, type of reservation, and a summary of type-specific information (a web reservation should list the source website and contact number, and a phone reservation should list the phone number).
 The restaurant has a capacity of 50 people, so there can be no more than 50 people reserved for an hour period. Reservation requests that break this rule should be rejected. Bonus: the system should recommend the next closest possible time for rejected reservations.
 Bonus: ten of the seats in the restaurant are reserved for in-person requests only.
 */

import java.util.*;

public class Application {
    public static int restaurantCapacity = 50;

    public static void main(String[] args){
        Interface.prompt();
    }

}

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 7/8/13
 * Time: 6:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReservationPhone extends Reservation {

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String formatDescription() {
        String result = super.formatDescription() + ", phone number " + this.phoneNumber;
        return result;
    }


}

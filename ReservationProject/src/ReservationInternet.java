/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 7/8/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReservationInternet extends Reservation {

    private String sourceWebsite;
    private String createTime;
    private String phoneNumber;


    public String formatDescription() {
        String result = super.formatDescription() + ", source website " + this.sourceWebsite;
        return result;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSourceWebsite() {
        return sourceWebsite;
    }

    public void setSourceWebsite(String sourceWebsite) {
        this.sourceWebsite = sourceWebsite;
    }
}

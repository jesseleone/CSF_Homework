import java.util.*;
/**
 * User, a class of people who borrow and return library items
 */

public class User {

    public User(String userName){
        this.userName = userName;
        this.userId = userCounter;
        userCounter++;
    }

    private static int userCounter = 0;
    private String userName;
    private int userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

}

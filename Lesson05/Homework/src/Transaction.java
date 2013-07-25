import java.util.*;

/**
 * Transaction class of objects that store transaction data
 */

public class Transaction {
    public Transaction(){}

    public Transaction(String transactionType, User user, Item item){
        this.transactionID = transactionCounter++;
        this.transactionType = transactionType;
        this.transactionDate = new Date();
        this.user = user;
        this.item = item;
    }

    private int transactionCounter = 0;

    //Transaction Variables
    private int transactionID;
    private String transactionType;
    private Date transactionDate;
    private User user;
    private Item item;



    public int getTransactionCounter() {
        return transactionCounter;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public User getUserId() {
        return user;
    }

    public Item getItemId() {
        return item;
    }


}

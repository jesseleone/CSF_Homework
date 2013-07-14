import java.util.*;

/**
 * Item, a superclass for books, magazines, and dvds
 */
public class Item {
    public Item(){}

    public Item(String itemTitle, String itemType, Object typeMetaData){
        this.itemTitle = itemTitle;
        this.itemType = itemType;
        this.typeMetaData = typeMetaData;
        this.itemIndex = itemCounter;
        itemCounter++;
    }

    private String itemTitle;
    private String itemType;
    private Object typeMetaData;
    private int itemIndex;
    private static int itemCounter = 0;
    private Calendar itemLoanDate;
    private Calendar itemReturnDate = itemLoanDate;
    private int borrowingUserId = 0;

    public String getItemTitle() {
        return itemTitle;
    }

    public int getItemIndex() {
        return itemIndex;
    }

    public Calendar getItemLoanDate() {
        return itemLoanDate;
    }

    public void setItemLoanDate(Calendar itemLoanDate) {
        this.itemLoanDate = itemLoanDate;
    }

    public Calendar getItemReturnDate() {
        return itemReturnDate;
    }

    public void setItemReturnDate(Calendar itemReturnDate) {
        this.itemReturnDate = itemReturnDate;
    }

    public String getItemType() {
        return itemType;
    }

    public int getBorrowingUserId() {
        return borrowingUserId;
    }

    public void setBorrowingUser(int borrowingUser) {
        this.borrowingUserId = borrowingUser;
    }

    public Object getTypeMetaData() {
        return typeMetaData;
    }

    public void setTypeMetaData(Object typeMetaData) {
        this.typeMetaData = typeMetaData;
    }
}

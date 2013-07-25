import java.util.*;
/**
 * Magazine, a subclass of items
 */
public class Magazine extends Item {
    public Magazine(){}

    public Magazine(String itemTitle, int issueNumber){
        super(itemTitle, "Magazine", issueNumber);
        this.issueNumber = issueNumber;
    }

    private int issueNumber;
    private String itemType = "magazine";

    public int getIssueNumber() {
        return issueNumber;
    }

}

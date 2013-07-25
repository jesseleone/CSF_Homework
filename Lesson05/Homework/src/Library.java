import java.util.*;
/**
 * Library class keeps track of item state and loans/returns items
 */

public abstract class Library {
    //Array to store available items
    static List<Item> availableItems = new ArrayList<Item>(10);

    //Array to store unavailable items
    static List<Item> unavailableItems = new ArrayList<Item>(10);

    //Array to store transactions
    static List<Transaction> transactionList = new ArrayList<Transaction>();

    //Array to store borrowing periods for items (days)
    static int bookPeriod = 7;
    static int magazinePeriod = 14;
    static int dvdPeriod = 3;

    //Variable holding Calendar of today's date
    static Calendar today = Calendar.getInstance();

    //Method for checking user for overdue

    public static boolean hasOverdueItems(User user){

        boolean hasOverdueItems = false;

        for(int i=0; i<unavailableItems.size(); i++){
            if(unavailableItems.get(i).getBorrowingUserId() == user.getUserId() && unavailableItems.get(i).getItemReturnDate().after(today)){
                hasOverdueItems=true;
                break;
            }
            else {
                hasOverdueItems=false;
            }
        }

        return hasOverdueItems;
    }

    //Method to loan item to user
    public static void loan(User user, Item item) {

        //Checks if item being loaned is in availableItems and if user does not have overdue items
        if(item.equals(availableItems.get(item.getItemIndex())) && !hasOverdueItems(user)){
            unavailableItems.set(item.getItemIndex(), item);
            availableItems.set(item.getItemIndex(), null);
            Calendar loanDate = Calendar.getInstance();
            item.setItemLoanDate(loanDate);
            item.setBorrowingUser(user.getUserId());

            //Sets return date for item depending on itemType
            Calendar returnDate = Calendar.getInstance();

            if(item.getItemType().equals("book")){
                returnDate.add(Calendar.DATE, bookPeriod);
                item.setItemReturnDate(returnDate);
            }
            else if(item.getItemType().equals("magazine")){
                returnDate.add(Calendar.DATE, magazinePeriod);
                item.setItemReturnDate(returnDate);
            }
            else if(item.getItemType().equals("dvd")){
                returnDate.add(Calendar.DATE, dvdPeriod);
                item.setItemReturnDate(returnDate);
            }

            //Adds transaction to transactionList
            transactionList.add(new Transaction("loan", user, item));

            System.out.println("Loaned " + item.getItemTitle() + " to user " + user.getUserName());
        }
        else {
            System.out.println("Loan failed." + item.getItemTitle() + " isn't loanable.");
        }

    }

    //Method to return item to library
    public static void returnItem(User user, Item item){
        if(item.equals(unavailableItems.get(item.getItemIndex()))){
            availableItems.set(item.getItemIndex(), item);
            unavailableItems.set(item.getItemIndex(), null);
            item.setBorrowingUser(0);
            transactionList.add(new Transaction("return", user, item));
        }
        else{
            System.out.println("This item cannot be returned.");
        }
    }

    //Method to print the details of all items currently on loan to a specific user, along with their due dates
    public static void printByUser(User user){
        System.out.println("Collection details for user " + user.getUserName());
        for(int i=0; i<unavailableItems.size(); i++){
            if(unavailableItems.get(i).getBorrowingUserId() == user.getUserId()){
                System.out.println(unavailableItems.get(i).getItemTitle());
                System.out.println("On loan to " + user.getUserName() + ", due back on " + unavailableItems.get(i).getItemReturnDate().DATE + "/" + unavailableItems.get(i).getItemReturnDate().MONTH + "/" + unavailableItems.get(i).getItemReturnDate().YEAR);

                //Prints meta data by itemType
                if(unavailableItems.get(i).getItemType().equals("book")){
                    System.out.println("Author: " + unavailableItems.get(i).getTypeMetaData());
                } else {
                    if(unavailableItems.get(i).getItemType().equals("magazine")){
                        System.out.println("Issue: " + unavailableItems.get(i).getTypeMetaData());
                    } else {
                        if(unavailableItems.get(i).getItemType().equals("dvd")){
                            System.out.println("Director: " + unavailableItems.get(i).getTypeMetaData());
                        }
                    }
                }
            }
        }
    }

    //Test method that creates one of each item type, loans them to a user, and prints the user's items
    public static void testMethod(){
        User sally = new User("Sally");
        User eric = new User("Eric");
        User bob = new User("Bob");
        unavailableItems.add(new Item());
        availableItems.add(new Book("Ninja Turtles the Book", "Dr Seuss"));
        availableItems.add(new Magazine("Ninja Turtles the Magazine", 1));
        availableItems.add(new Dvd("Ninja Turtles the Movie", "Fellini"));
        loan(bob, availableItems.get(0));
        loan(bob, availableItems.get(1));
        loan(bob, availableItems.get(2));
        printByUser(bob);
    }
}

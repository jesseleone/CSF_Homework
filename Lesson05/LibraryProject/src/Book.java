/**
 * Book, a subclass of items
 */
public class Book extends Item {
    public Book(){}

    public Book(String itemTitle, String author){
        super(itemTitle, "book", author);
        this.author = author;
    }

    private String author;

    public String getAuthor() {
        return author;
    }
}

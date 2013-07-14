/**
 * Dvd, a subclass of items
 */
public class Dvd extends Item {
    public Dvd(){}

    public Dvd(String itemTitle, String director){
        super(itemTitle, "dvd", director);
        this.director = director;
    }

    private String director;

    public String getDirector() {
        return director;
    }

}

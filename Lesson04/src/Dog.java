/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 7/1/13
 * Time: 7:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dog {
    public Dog(){
        this.numberOfLegs = 4;
        this.name = "Fido";
    }

    public Dog(String name){

        this.name = name;
    }

    public String bark(){
        return "Woof!";
    }

    public int numberOfLegs(){
        return 4;
    }

    public int numberOfLegs;
    public String name;
}

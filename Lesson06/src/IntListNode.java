/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 7/15/13
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntListNode {
    //constructors
    public IntListNode(){}

    public IntListNode(int value) {
        this.value = value;
    }

    public IntListNode(int value, IntListNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    //node vars
    private int value;
    private IntListNode nextNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(IntListNode nextNode) {
        this.nextNode = nextNode;
    }
}

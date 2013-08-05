import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 7/20/13
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntStack extends IntLinkedList {
    private IntListNode topNode;

    public void push(int n){
        if(topNode == null){
            topNode = new IntListNode(n);
        }else{
            IntListNode newNode = new IntListNode(n);
            newNode.setNextNode(topNode);
            topNode = newNode;
        }
    }

    public void pop(){
        System.out.println("Popped: " + topNode.getValue());
        topNode = topNode.getNextNode();
    }

    public void print(){
        IntListNode printNode = topNode;
        while(printNode != null){
            System.out.println(printNode.getValue());
            printNode = printNode.getNextNode();
        }


    }

}

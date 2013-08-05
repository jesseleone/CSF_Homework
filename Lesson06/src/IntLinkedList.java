import java.util.*;

public class IntLinkedList {
    private IntListNode firstNode;


    public void insert(int n){
        if(firstNode==null){
            firstNode = new IntListNode();
            firstNode.setValue(n);
        }
        else{
            IntListNode currentNode = firstNode;
            //loop until we find a null node
            while (currentNode.getNextNode() != null){

                //Do nothing if value exists
                if(n == currentNode.getValue()){
                    System.out.println("No action taken. Value already exists.");
                    return;
                }else {
                    //
                    currentNode = currentNode.getNextNode();
                }

            }
            currentNode.setNextNode(new IntListNode(n));
            currentNode = null;
        }
    }

    public void print(){
        IntListNode printNode = firstNode;
        while(printNode != null){
            System.out.println(printNode.getValue());
            printNode = printNode.getNextNode();
        }


    }
}

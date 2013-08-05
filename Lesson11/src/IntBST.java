import java.util.*;

public class IntBST {
    private IntNode rootNode;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntBST bst = new IntBST();
        while(true) {
            System.out.print("print, gt or insert: ");
            String result = scanner.next();

            if (result.equals("print")) {
                bst.printBFS();
                bst.printDFS();;
            } else {
                System.out.print("\nvalue? ");
                int value = scanner.nextInt();

                if (result.equals("gt")) {
                    bst.valuesGreaterThan(value);
                } else if (result.equals("insert")) {
                    bst.insertValue(value);
                }
            }
        }
    }

    public void printBFS() {
        // TODO: Implement a BFS of a tree using a queue
        System.out.print("BFS of BST:" );
    }

    private void inOrderTraversal(IntNode node){
        if(node==null){
            return;
        }else{

            inOrderTraversal(node.getLeftChild());
            System.out.println(node.getValue());
            inOrderTraversal(node.getRightChild());
        }
    }

    private void preOrderTraversal(IntNode node){
        if(node==null){
            return;
        }else{
            System.out.println(node.getValue());
            preOrderTraversal(node.getLeftChild());
            preOrderTraversal(node.getRightChild());
        }
    }

    public void printDFS() {
        // TODO: Impelement a DFS (of your choice) of a tree using recursion

        System.out.println("DFS of BST:" );
        preOrderTraversal(rootNode);
    }

    public void valuesGreaterThan(int n) {
        // TODO: Prints out values that are greater than or equal to n.
        // Do this with the lowest computational complexity you can manage.
        System.out.println("Values in tree greater than " + n + ":");
    }

    public void insertValue(int value) {
        if (rootNode == null) {
            rootNode = new IntNode(value);
        }
        else {
            IntNode currentNode = rootNode;

            while (currentNode.getValue() != value) {
                if (value > currentNode.getValue()) { // Right child path
                    if (currentNode.getRightChild() == null) {
                        currentNode.setRightChild(new IntNode(value));
                    }
                    currentNode = currentNode.getRightChild();
                }
                else { // Left child path
                    if (currentNode.getLeftChild() == null) {
                        currentNode.setLeftChild(new IntNode(value));
                    }
                    currentNode = currentNode.getLeftChild();
                }
            }
        }
    }

    public boolean search(int value) {
        IntNode currentNode = rootNode;

        while(currentNode != null && (currentNode.getValue() != value)) {
            if (value > currentNode.getValue()) { // Continue down the right child path
                currentNode = currentNode.getRightChild();
            }
            else { // Continue down the left child path
                currentNode = currentNode.getLeftChild();
            }
        }
        // If the current node exists and its value is equal to the input, return true, else return false
        return currentNode != null && (currentNode.getValue() == value);
    }
}

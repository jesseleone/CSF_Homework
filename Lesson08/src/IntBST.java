import java.util.LinkedList;


public class IntBST {
    private IntNode rootNode;

    public void printTree() {
        LinkedList<IntNode> queue = new LinkedList<IntNode>();
        queue.add(rootNode);
        System.out.print("BFS of BST:" );

        while(!queue.isEmpty()) {
            IntNode node = queue.remove();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChild() != null)
                queue.add(node.getLeftChild());
            if (node.getRightChild() != null)
                queue.add(node.getRightChild());
        }
    }


    public void insertValue(int value) {
        // TODO: Implement insert value for a binary search tree
        IntNode thisNode;

        if(rootNode == null){
            rootNode = new IntNode(value);
        } else {
            thisNode = rootNode;
            while (thisNode != null){
                if(thisNode.getValue()> value && thisNode.getLeftChild() == null){
                    thisNode.setLeftChild(new IntNode(value));
                    thisNode = null;
                }
                else if (thisNode.getValue()> value && thisNode.getLeftChild() != null){
                    thisNode = thisNode.getLeftChild();
                }
                else if(thisNode.getValue() < value && thisNode.getRightChild() == null){
                    thisNode.setRightChild(new IntNode(value));
                    thisNode = null;
                }
                else if(thisNode.getValue() < value && thisNode.getRightChild() != null){
                    thisNode = thisNode.getRightChild();
                }
            }

        }

    }

    public boolean search(int value) {
        // TODO: Implement search for a value for a binary search tree
        IntNode thisNode;
        if(rootNode == null){
            return false;
        }else {
            thisNode = rootNode;
            while (thisNode != null){

            }
        }

        throw new UnsupportedOperationException("Not implemented!");

        //return false;
    }

    public void remove(int value) {
        // TODO: Optional Challenge HW Question for next Monday
        // To remove, first examine the find the node, then:
        // 1) Node N has no children? Just remove N
        // 2) Node N has one child? Just remove N and replace with the child
        // 3) Node N has two children? A little harder. Either take the in-order successor or predecessor R, swap the values of N and R, then delete R

    }
}

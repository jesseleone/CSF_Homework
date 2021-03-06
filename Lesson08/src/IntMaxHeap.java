import java.util.ArrayList;

public class IntMaxHeap {
    private ArrayList<Integer> array;

    public IntMaxHeap() {
        array = new ArrayList<Integer>();
    }

    public void insertValue(int value) {
        // When you want to test this method, remove the 'throw' line below
<<<<<<< HEAD
        //throw new UnsupportedOperationException("Not implemented!");
=======
//        throw new UnsupportedOperationException("Not implemented!");
>>>>>>> 1a063b416922c54ad866294d900b21581b1eca78

        // Add to the end of the array
        // Note: The Integer class is an Object wrapper around an int that makes it storable in
        //  Java's collection classes
        // To get an int from an Integer intInstance, call intInstance.intValue() 
        array.add(new Integer(value));

        if (array.size() > 1)
        {
            // TODO: While the new value is greater than its parent value, "bubble up" the 
            //  new value in the heap by swapping it with its parent node  
            // The object that is added above is at the end of the array (i.e. its index is array.size() - 1)
            // The parent node index of a node at childIndex is (childIndex - 1)/2.
            //  E.g. If a child node is at index 10 in the array, 
            //  its parent node is at position (10-1)/2, which is 4 (integer division rounds down)

            // Solution code:
            int index = array.size() - 1;
            int parentIndex = (index - 1)/2;
            int parentValue =  array.get(parentIndex).intValue();

            while (value > parentValue) {
                // Swap parent value and new value
                array.set(index, new Integer(parentValue));
                array.set(parentIndex, new Integer(value));

                index = parentIndex;
                parentIndex = (index - 1)/2;
                parentValue =  array.get(parentIndex).intValue();
            }
        }
    }

    public void printTopValue() {
        System.out.println("Top value in MaxHeap: " + array.get(0));
        System.out.println("Entire array representing MaxHeap: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i).intValue() + " ");
        }
    }
}
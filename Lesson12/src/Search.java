import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

public class Search {
    private Search() {
        super();
    }

    /**
     * @param array A sorted array of ints to search through. This must be sorted.
     * @param searchTerm An int to search the array for
     * @return Whether the searchTerm exists in the array
     */
    public static boolean binarySearch(int[] array, int searchTerm) {
        /*
        TODO: Fill this in. Note that you can either make copies of the array
         as you search, or perform the search without ever copying the array.
         Start with the former, then try for the latter.
         */
<<<<<<< HEAD
        if (array.length == 0){
            return false;
        }

        int middleIndex = array.length/2;


        if(searchTerm == array[middleIndex]){
            return true;
        }

        int[] xArray;

        int middleValue = array[middleIndex];
        if(searchTerm > middleValue){
            xArray = Arrays.copyOfRange(array, middleIndex + 1, array.length);
            return binarySearch(xArray, searchTerm);
        }else{
            xArray = Arrays.copyOfRange(array, 0, middleIndex);
            return binarySearch(xArray, searchTerm);
=======
        //throw new NotImplementedException();

        // Instructor sample soln below
        return binarySearchWithoutCopy(array, searchTerm);
        //return binarySearchWithCopy(array, searchTerm);
    }

    private static boolean binarySearchWithCopy(int[] array, int searchTerm) {
        if (array.length == 0)
            return false;

        int middle = array[array.length/2];
        if (searchTerm == middle)
            return true;
        else if (searchTerm < middle) {
            return binarySearch(Arrays.copyOfRange(array, 0, array.length/2), searchTerm);
        }
        else { // Greater than
            return binarySearch(Arrays.copyOfRange(array, array.length/2 + 1, array.length), searchTerm);
        }
    }

    private static boolean binarySearchWithoutCopy(int[] array, int searchTerm) {
        return binarySearchRecursive(array, searchTerm, 0, array.length);
    }

    private static boolean binarySearchRecursive(int[] array,
                                                 int searchTerm,
                                                 int rangeBegin,
                                                 int rangeEnd) {
        if (rangeBegin == rangeEnd)
            return false;

        int rangeSize = rangeEnd - rangeBegin;
        int middleIndex = (rangeBegin + rangeEnd)/2;
        int middleValue = array[middleIndex];

        if (searchTerm == middleValue)
            return true;
        else if (searchTerm < middleValue) {
            return binarySearchRecursive(array, searchTerm, rangeBegin, middleIndex);
        }
        else { // Greater than
            return binarySearchRecursive(array, searchTerm, middleIndex + 1, rangeEnd);
>>>>>>> 2f5db9c2e617a395930ba392b91e763e3c956cac
        }
    }

}

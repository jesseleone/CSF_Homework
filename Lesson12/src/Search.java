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
        }
    }

}

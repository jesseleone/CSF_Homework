import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

public class Sort {
    private Sort() {
        super();
    }

    /**
     * Sorts given array using the insertionSort technique
     * @param array The array of ints to sort, ascending
     */
    public static void insertionSort(int[] array) {
        // TODO: Perform an insertion sort on the array
        throw new NotImplementedException();
    }

    /**
     * Sorts given array using a recursiveMergeSort technique
     * @param array The array of ints to sort, ascending
     *
     */
    public static int[] recursiveMergeSort(int[] array) {
        if(array.length==1){
            return array;
        }
        // split array into 2
        int middleIndex = (array.length)/2;

        int[] lowerArray = Arrays.copyOfRange(array, 0, middleIndex);
        int[] upperArray = Arrays.copyOfRange(array, middleIndex+1, array.length);

        return recursiveMergeSort(mergeHelper(lowerArray, upperArray));


        //rerturn mergeHelper(lowerArray,upperArray);



    }


    public static int[] mergeHelper(int[] array1 , int[] array2 ){

        int[] finalArray = new int[array1.length +array2.length];

        int index1 = 0;
        int index2 = 0;

        //compare at each index the values of each of the subarray


            for(int i=0;i<finalArray.length;i++){
                if(array1[index1] < array1.length && (array2[index2] < array2.length || array1[index1] < array2[index2])){
                    finalArray[i] = array1[index1];
                    index1++;
                }else if(array2[index2] < array2.length) {
                    finalArray[i] = array2[index2];
                    index2++;
                }

            }


        if(index1>array1.length){
            finalArray[array1.length +array2.length -1] = array2[index2];
        }else{
            finalArray[array1.length +array2.length -1] = array1[index1];
        }



        return finalArray;
    }
}

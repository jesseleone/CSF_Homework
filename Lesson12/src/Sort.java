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
//        throw new NotImplementedException();

        // Instructor soln
        for (int i = 0; i < array.length; i++) {
            int valueToInsert = array[i];
            int holeIndex = i;

            while (holeIndex > 0 && valueToInsert < array[holeIndex - 1]) {
                array[holeIndex] = array[holeIndex - 1];
                holeIndex--;
            }
            array[holeIndex] = valueToInsert;
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Sorts given array using a recursiveMergeSort technique
     * @param array The array of ints to sort, ascending
     *
     */
    public static int[] recursiveMergeSort(int[] array) {
<<<<<<< HEAD
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
=======
        //throw new NotImplementedException();

        // Instructor sample soln:
        if (array.length <= 1)
            return array;

        int middleIndex = array.length/2;
        int[] left = Arrays.copyOfRange(array, 0, middleIndex);
        int[] right = Arrays.copyOfRange(array, middleIndex, array.length);

        left = recursiveMergeSort(left);
        right = recursiveMergeSort(right);

        return merge(left, right);
    }

    /**
     * Helper method that merges two sorted arrays together
     * @param left Left sorted array
     * @param right Right sorted array
     * @return The sorted, merged result
     */
    private static int[] merge(int[] left, int[] right) {
        int[] mergedList = new int[left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < mergedList.length; i++) {
            if (leftIndex < left.length && (
                    rightIndex >= right.length ||
                         left[leftIndex] < right[rightIndex])) {
                 mergedList[i] = left[leftIndex];
                 leftIndex++;
            }
            else {
                mergedList[i] = right[rightIndex];
                rightIndex++;
            }
        }
        return mergedList;
>>>>>>> 2f5db9c2e617a395930ba392b91e763e3c956cac
    }
}

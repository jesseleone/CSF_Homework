public class Lesson03Samples {
 
    public static void main(String args[]) {
        int[] array1 = {1, 3, 5, 11};
        int[] array2 = {2, 4, 6, 12, 40};
        int[] arrayToMergeInPlace = {1, 3, 5, 6, 9, 2, 4, 7, 8, 11};
        int[] arrayToSort = {10, 400, 12, 57, 2, 5, 8, -10, 58, 3};
        //merge(array1, array2);
        //mergeInPlace(arrayToMergeInPlace, 0, 5, 10);
        //mergeSort(arrayToSort);
    }
 
    public static int[] merge(int[] array1, int[] array2) {
        // Given two sorted arrays, combine them into a merged array which has all the elements of both in sorted order.
        return mergedArray;
    }
 
    public static void mergeInPlace(int[] array, int i, int j, int k) {
        // Assuming that the elements of array are in sorted order between array[i] and array[j-1],
        // and between array[j] and array[k-1], rearrange the array to put the elements between array[i] and
        // array[k-1] in sorted order.
        return;
    }
 
    public static int[] mergeSort(int[] arrayToSort) {
        // Using the mergeInPlace method you just wrote, write a function to sort a given array. Remember to make a
        // copy of the original array first to avoid overwriting the original. Hint: start by sorting the smallest
        // possible subsections of the array, and combine them with mergeInPlace until the whole array is sorted.
        return sortedArray;
    }
 
    public static int[] bubbleSortWithComparisonCounter(int[] arrayToSort) {
        // Write an implementation of the bubble sort algorithm that keeps a count of how many times you compare
        // elements of the array (eg. array[i]<array[j]). Before returning the sorted array print the numbers of
        // comparisons used to the console.
        return sortedArray;
    }
 
    public static int[] mergeSortWithComparisonCounter(int[] arrayToSort) {
        // Update your implementation of merge sort above to keep a count of comparisons. Try merge sort and bubble
        // sort with different arrays and look at the number of comparisons used. Why is merge sort more efficient?
        return sortedArray;
    }
}

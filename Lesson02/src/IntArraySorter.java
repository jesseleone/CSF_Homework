public class IntArraySorter {
    public int[] sortArray(int[] array) {
        // For each number in the array
        // Look at every number after it, in sequence
        // If the first number is greater than the second, swap them

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        return array;
    }
}
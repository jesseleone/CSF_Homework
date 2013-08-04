/**
 * Divide and conquer
 * - Breaks problem into smaller components and solves the smaller components
 * - Binary search is an example
 *
 * Sorting
 *
 * MergeSort
 * O(nlogn)
 * Base case: size = 1
 * if size > 1, divide and conquer
 * 1. take bigger array, split into left and right
 * 2. recursively merge sort two arrays seperately
 * 3. merge arrays together (look at first element, step up array)
 *
 * for(int i; i<=finalarray.length; i++)
 * jesseleone@
 *
 * Insertion Sort
 * insert each element into an array that holds the sorted values, stepping through each element in the sorted array until you find the right place to insert your new value
 * O(n^2)
 * Bas performance but simple and practical in some cases
 *
 * HeapSort
 * build up a priority queue from the input, then pluck off the minimum values from the heap one at a time
 * O(n log n)
 *
 * In place sorting algorithms dont create new arrays (sort in place)
 *
 * Selection Sort
 *
 * QuickSort
 * recursive/divide and conquer
 * pivots around randomized pivot points, sorting as it goes
 * bad for massive arrays because it's recursive
 * can be logn or n^2
 *
 * IntroSort
 * starts with quicksort and switches to heapsort
 *
 */
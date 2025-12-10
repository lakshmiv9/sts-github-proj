package com.example.demo.DataStrctureExmpl;

public class quicksort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        quickSort(arr, 0, arr.length - 1);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int p = partition(arr, low, high); // pivot index

            quickSort(arr, low, p - 1);  // left part
            quickSort(arr, p + 1, high); // right part
        }
    }

    // Partition using last element as pivot
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }
}

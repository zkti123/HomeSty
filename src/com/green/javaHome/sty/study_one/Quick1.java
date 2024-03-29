package com.green.javaHome.sty.study_one;



public class Quick1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 17, 2, 6, 4, 7};

        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value+" ");
        }
        System.out.println();
    }

    static int patition(int[] arr, int row, int high) {
        int pivot = arr[high];
        int i = (row - 1);
        for (int j = row; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    static void quickSort(int[] arr, int row, int high) {
        if (row < high) {
            int pi = patition(arr, row, high);
            quickSort(arr, row, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

}

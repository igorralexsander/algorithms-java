package com.igorralexsander.ordering;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    private static void quickSort(int[] array, int start, int end){
        if(start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex -1);
            quickSort(array, pivotIndex + 1, end);
        }
    }
    private static int partition(int[] array, int start, int end){
        int pivot=array[end];
        int i = start - 1;
        for(int j=start; j < end; j++){
            if(array[j] < pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, end);
        return i + 1;
    }
    private static void swap(int[] array, int from, int to){
        int temp=array[to];
        array[to]=array[from];
        array[from]=temp;
    }
}

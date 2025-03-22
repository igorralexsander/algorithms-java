package com.igorralexsander.ordering;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[] { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void selectionSort(int[] array) {
        for(int i=0; i<array.length; i++){
            int minValueIndex=i;
            for(int j=i; j < array.length; j++){
                if(array[j] < array[minValueIndex]){
                    minValueIndex=j;
                }
            }
            swap(array, minValueIndex, i);
        }
    }
    private static void swap(int[] array, int from, int to){
        int temp=array[to];
        array[to]=array[from];
        array[from]=temp;
    }
}

package com.example.datastructure.selectionsort;
import java.util.Arrays;

public class SelectionSort {
    static int[] array;

    public static void main(String[] args) {
        array = new int[10];
        for(int i=0; i< 10; i++){
            array[i] = (int)(Math.random()* 10);
        }

        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(array));

        for(int i = 0; i< array.length -1; i++){
            int minIndex = i;
            for(int j = i+1; j< array.length; j++){
                if(array[minIndex]> array[j]){
                    minIndex = j;
                }

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(array));
    }
}

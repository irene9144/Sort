package com.example.datastructure.insertionsort;

import java.util.Arrays;


public class InsertionSort {
    static int[] array;

    public static void main(String[] args) {
        array = new int[10];
        for(int i=0; i< 10; i++){
            array[i] = (int)(Math.random()* 10);
        }

        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(array));

       for (int i=1; i< array.length; i++){
           //선택 데이터
           int key = array[i];
           //비교 데이터
           int j = i-1;
           // 이전의 원소가 더 크다면 데이터는 하나씩 밀려난다.
           while(j >= 0 && array[j] > key) {
               array[j+1] = array[j];
               j--;
           }
           array[j+1] = key;

       }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(array));
    }
}

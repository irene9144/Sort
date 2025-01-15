package com.example.datastructure.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    static int[] array;

    public static void main(String[] args) {
        array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(array));

        for(int i=array.length -1 ; i > 0; i++){
            // 0 ~ (i-1)까지 반복
            for(int j= 0; j< i; j++){
                // j번째와 j+1번째의 요소가 크기 순이 아니면 교환
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(array));
    }
}

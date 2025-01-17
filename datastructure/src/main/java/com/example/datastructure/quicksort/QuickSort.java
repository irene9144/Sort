package com.example.datastructure.quicksort;

import java.util.Arrays;

public class QuickSort {

    // 메인 함수
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // 퀵소트 함수
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 피벗으로 분할
            int pivotIndex = partition(arr, low, high);

            // 피벗 기준 왼쪽과 오른쪽 정렬
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // 분할 함수
    public static int partition(int[] arr, int low, int high) {
        // 마지막 요소를 피벗으로 선택
        int pivot = arr[high];
        int i = low - 1; // 작은 요소의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같은 경우
            if (arr[j] <= pivot) {
                i++;
                // 스왑
                swap(arr, i, j);
            }
        }

        // 피벗을 올바른 위치로 이동
        swap(arr, i + 1, high);
        return i + 1; // 피벗의 인덱스 반환
    }

    // 두 요소를 스왑하는 함수
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

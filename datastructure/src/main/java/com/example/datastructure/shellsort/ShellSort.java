package com.example.datastructure.shellsort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 76, 1, -3, 8, 0, -50};

        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(array));

        // Gap에 따라 정렬 하기 위해 Gap을 이용한 반복문을 생성함
        // 최초는 array 길이의 /2 그리고 gap /2 씩 1이 될때까지 순환
        for (int gap = array.length / 2; gap > 0; gap /= 2) { // 5, 3 , 1

            // Gap의 크기에 맞게 최초 정렬을 시작할 기준을 지정하여 반복문 형성
            for (int i = gap; i < array.length; i++) {  //  최초 5, 6 ,7 8, 9, 10 두번째 : 3,4,5,6,7,8,9

                // i에 지정된 값에 해당하는 Value를 정렬 시를 대비해 미리 저장해 둠
                int key = array[i];
                // j를 이용해 Gap 만큼의 반복 정렬을 수행할 것이므로 따로 저장
                int j = i;

                // 해당 반복 정렬을 조건이 참인 경우 수행
                // 해당 조건은, j의 index 값이 gap보다 커야 하며, j-gap의 index에 지정 된 배열 값이 이전에 저장된 내용보다 큰 경우
                while (j >= gap & array[j - gap] > key) { // 최초 5 , 0 / 6, 1 / 7, 2 ... 두번째: 3, 0 / 4,1 / 5,2 ...
                    // gap만큼 씩 뒤로 밀림
                    array[j] = array[j - gap];
                    // 반복 비교를 위해 gap만큼 씩 줄어듬
                    j -= gap;
                }
                // 기존에 저장한 배열 값을 저장
                array[j] = key;
            }
        }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(array));
    }
}
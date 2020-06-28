package com.ranger.sort;

/**
 * 选择排序
 * @author Bob
 */
public class SelectionSort {

    public void sort(int[] arr) {
        int length = arr.length;
        int temp;
        int minIndex;

        for (int i = 0; i < length - 1; i++) {
            minIndex = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}

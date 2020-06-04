package com.ranger.sort;

/**
 * <p>
 * 快速排序的基本思想：通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续
 * 进行排序，以达到整个序列有序。
 * <p>
 * 算法描述
 * 快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
 * <p>
 * 从数列中挑出一个元素，称为 “基准”（pivot）；
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准
 * 就处于数列的中间位置。这个称为分区（partition）操作；
 * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 *
 * @author Bob
 */
public class QuickSort {

    public void quickSort1(int[] arr, int start, int length) {
        int i, j, temp;

        if (start > length) {
            return;
        }

        i = start;
        j = length;
        temp = arr[i];

        while (i < j) {
            while (i < j && temp <= arr[j]) {
                j--;
            }

            while (i < j && temp >= arr[i]) {
                i++;
            }

            if (i < j) {
                int z = arr[i];
                int y = arr[j];

                arr[i] = y;
                arr[j] = z;
            }
        }
        arr[start] = arr[i];
        arr[i] = temp;

//        quickSort1(arr, start, j - 1);
//        quickSort1(arr, j + 1, length);

        quickSort1(arr, start, i - 1);
        quickSort1(arr, i + 1, length);
    }

    private void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

}

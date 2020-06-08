package com.ranger.sort;

/**
 * 交换排序-冒泡排序
 * <p>
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 * <p>
 * 1.1 算法描述
 * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 针对所有的元素重复以上的步骤，除了最后一个；
 * 重复步骤1~3，直到排序完成。
 *
 * @author Bob
 */
public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int length = arr.length;
        int temp;
//        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}

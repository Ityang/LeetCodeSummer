package com.ranger;

import com.ranger.leetcode.Day02;
import com.ranger.sort.QuickSort;

/**
 * @author Bob
 */
public class MainInter {

    public static void main(String[] args) {

//        int[] digits = {9,9,9};
//        Day01 day01 = new Day01();
//        day01.plusOne(digits);

        int[] sortColor = {2, 0, 2, 1, 1, 0};
        Day02 day02 = new Day02();
        day02.sortColors(sortColor);


//        int[] arr = {6,1,2,7,9,3,4,5,10,8};
//        QuickSort sort = new QuickSort();
//        sort.quickSort1(arr,0,arr.length-1);
//        print(arr);

    }

    private static void print(int[] nums) {
        System.out.println("数据为：");
        System.out.print("[");
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.print("]");
    }
}

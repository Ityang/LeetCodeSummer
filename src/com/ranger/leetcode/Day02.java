package com.ranger.leetcode;

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 * 示例:
 * <p>
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * 进阶：
 * <p>
 * 一个直观的解决方案是使用计数排序的两趟扫描算法。
 * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 * 你能想出一个仅使用常数空间的一趟扫描算法吗
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-colors
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Bob
 * @date 2020-06-02
 */
public class Day02 {

    public void sortColors(int[] nums) {
        int num = 0;
        int length = nums.length - 1;
        if (length == 0) {
            return;
        }
        for (int i = 0; i <= length; i++) {
            while (i < length && nums[i] == 2) {
                swap(nums, i, length);
                length--;
                System.out.println("length:"+ length);
            }
            while (i > num && nums[i] == 0) {
                swap(nums, i, num);
                num++;
                System.out.println("num:"+ num);
            }
        }
        print(nums);
    }

    private void swap(int[] nums, int lh, int rh) {
        int temp = nums[lh];
        nums[lh] = nums[rh];
        nums[rh] = temp;
    }


    private void print(int[] nums) {
        System.out.println("数据为:");
        System.out.print("[");
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.print("]");
    }

}

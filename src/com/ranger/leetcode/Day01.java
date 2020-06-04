package com.ranger.leetcode;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Bob
 * @date 2020-06-01
 */
public class Day01 {

    /**
     * 需要考虑3种情况：
     * 1、尾数不为9，直接+1 即可。如【1，2，4】
     * 2、尾数为9，前一位不为9。如【1，2，9】
     * 3、全为9。如【9，9，9】
     * 数组一旦创建，则不能修改长度。
     *
     * @param digits 输入的数组
     * @return 输出 +1 后的数组
     */
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }

        print(digits);
        int[] results;
        //第三种情况
        if (digits[0] == 0) {
            results = new int[length + 1];
            results[0] = 1;
        } else {
            results = digits;
        }

        print(results);
        return results;
    }

    private void print(int[] nums) {
        System.out.println("数据为：");
        System.out.print("[");
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.print("]");
    }
}

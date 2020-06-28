package com.ranger.leetcode;

import java.util.LinkedList;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Bob
 */
public class Day07 {

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ListNode node = reverseList(listNode);

        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);
//        System.out.println(listNode.next.next.next);

    }
}

package com.ranger.leetcode.tree;

import com.ranger.leetcode.ListNode;
import com.ranger.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class PreOrderTraversal {

    /**
     * 从根节点开始，每次迭代弹出当前栈顶元素，并将其孩子节点压入栈中，先压右孩子再压左孩子
     * 顺序为从上到下，从左到右，符合前序遍历。
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode root) {

        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }

            if (node.left != null) {
                stack.add(node.left);
            }
        }

        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i).toString());
        }

        return output;
    }

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = null;
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);

        preorderTraversal(treeNode);

//        System.out.println(treeNode.val);
//        System.out.println(treeNode.next.val);
//        System.out.println(treeNode.next.next.val);


    }
}

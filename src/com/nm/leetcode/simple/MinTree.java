package com.nm.leetcode.simple;

/**
 * @Author NM
 * @Date 2021/3/18 13:00
 */
public class MinTree {

//    给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
//
//    示例:
//    给定有序数组: [-10,-3,0,5,9],
//
//    一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
//
//            0
//            / \
//            -3   9
//            /   /
//            -10  5

    //1. 取中间的数字为根节点
    //2. 中间左侧为左树，右侧为右树，
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        tree(root, nums, mid);
        return root;
    }

    private void tree(TreeNode root, int[] nums, int i) {
        root.left

    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}

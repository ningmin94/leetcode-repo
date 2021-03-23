package com.nm.leetcode.simple;

/**
 *
 * 最小高度二叉树
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
//          -3   9
//          /   /
//        -10  5

    //1. 取中间的数字为根节点
    //2. 中间左侧为左树，右侧为右树，
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length<=0) {
            return null;
        }
        return tree(nums, 0, nums.length-1);
    }

    // 主节点 + 左右子节点 为一组 进行递归
    private TreeNode tree(int[] nums, int left, int right) {//0 4  // 0 1 // 1 1
        if(left < 0 || right >= nums.length || left > right){
            return null;
        }
        int avg = (right + left) / 2; // 2 // 0 // 1
        TreeNode node = new TreeNode(nums[avg]);
        node.left = tree(nums, left, avg-1); // 0 1 // 0 0 // 1 0 end
        node.right = tree(nums, avg+1, right);// 3 5 // 1 1
        return node;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode n = new MinTree().sortedArrayToBST(nums);
        int i = 12;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}

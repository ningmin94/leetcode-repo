package com.nm.leetcode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
//
//        幸运数是指矩阵中满足同时下列两个条件的元素：
//
//        在同一行的所有元素中最小
//        在同一列的所有元素中最大
//         
//
//        示例 1：
//
//        输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
//        输出：[15]
//        解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
//        示例 2：
//
//        输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//        输出：[12]
//        解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
//        示例 3：
//
//        输入：matrix = [[7,8],[1,2]]
//        输出：[7]


// 3 7 8
// 9 11 13
// 16 15 17
public class LuckyMumber {


    //1. 先找到最小值所在的列
    //2. 再在这一列找寻最大值
    //3. 比较最小值和最大值是否相等
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> r = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return null;
        }
        int m = matrix.length; int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int colIndex = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] < min){
                    colIndex = j;
                    min = matrix[i][j];
                }
            }
            int max = Integer.MIN_VALUE;
            for(int[] arr : matrix){
                if(arr[colIndex] > max){
                    max = arr[colIndex];
                }
            }
            if(max == min){
                r.add(max);
                return r;
            }
        }
        return r;

    }

    public static void main(String[] args) {
        int[][] m = {{3,7,8},{9,11,13},{15,16,17}};
//        int[][] m = {{56216},{63251},{75772},{1945},{27014}};
        List<Integer> list =  new LuckyMumber().luckyNumbers(m);
        System.out.println(list.get(0));
    }
}

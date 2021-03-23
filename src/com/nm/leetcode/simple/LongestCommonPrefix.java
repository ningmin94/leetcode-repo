package com.nm.leetcode.simple;

/**
 * @Author NM
 * @Date 2021/3/23 21:14
 */
public class LongestCommonPrefix {
//    编写一个函数来查找字符串数组中的最长公共前缀。
//
//    如果不存在公共前缀，返回空字符串 ""。
//
//    示例 1：
//
//    输入：strs = ["flower","flow","flight"]
//    输出："fl"
//    示例 2：
//
//    输入：strs = ["dog","racecar","car"]
//    输出：""
//    解释：输入不存在公共前缀。
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        char[] result = new char[200];
        for(String _s : strs){
            if(_s.equals("")){
                return "";
            }
            if(result.length > _s.length()){
                result = _s.toCharArray();
            }
        }
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if(str.equals(String.valueOf(result))){
                continue;
            }
            char[] chars = str.toCharArray();
            inner: for (int j = 0; j < chars.length; j++) {
                if(j < result.length && chars[j] != result[j]){
                    if(j == 0){
                        return "";
                    }
                    result = strs[0].substring(0, j).toCharArray();
                    break inner;
                }
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String r = new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(r);
    }
}

package com.nm.leetcode.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * 唯一摩尔斯密码词
 *
 * @Author NM
 * @Date 2021/3/20 12:34
 */
public class MorseSecert {

    final static String[] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//    final static List abcs = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<String>();

        for(String word : words){
            String s = "";
            for (char cell : word.toCharArray()){
//                int index = abcs.indexOf(cell);
                s+=morses[cell - 'a']; // char 值差
            }
            result.add(s);
        }
        return result.size();
    }

    public static void main(String[] args) {
       int size = new MorseSecert().uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        System.out.println(size);
    }
}

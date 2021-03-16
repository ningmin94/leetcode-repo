package com.nm.leetcode.simple;

/**
 * 罗马数字转数字
 * @Author NM
 * @Date 2021/3/16 12:34
 */
public class RomanNumber {

    public static void main(String[] args) {
      int i = new RomanNumber().romanToInt("MCMXCIV");
      System.out.println(i);
    }

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

    public int romanToInt(String s) {
        return calc(s, 0);
    }

    private int calc(String s, int result) {
        if(s.length() == 0){
            return result;
        }else{
          int flag = 1;
          String[] subArr = s.split("");
          String first = subArr[0];
          switch (first){
              case "M":
                  result+=1000;
                  break;
              case "D":
                  result+=500;
                  break;
              case "C":
                  if(subArr.length == 1){
                    result+=100;
                  }else{
                      String next = subArr[1];
                      if("M".equals(next)){
                          result+=900;
                          flag++;
                      }else if("D".equals(next)){
                          result+=400;
                          flag++;
                      }else{
                          result+=100;
                      }
                  }
                  break;
              case "L":
                  result+=50;
                  break;
              case "X":
                  if(subArr.length == 1){
                      result+=10;
                  }else {
                      String next = subArr[1];
                      if ("C".equals(next)) {
                          result += 90;
                          flag++;
                      } else if ("L".equals(next)) {
                          result += 40;
                          flag++;
                      } else {
                          result += 10;
                      }
                  }
                  break;
              case "V":
                  result+=5;
                  break;
              case "I":
                  if(subArr.length == 1){
                      result+=1;
                  }else{
                      String next = subArr[1];
                      if("X".equals(next)){
                          result+=9;
                          flag++;
                      }else if("V".equals(next)){
                          result+=4;
                          flag++;
                      }else{
                          result+=1;
                      }
                  }
                  break;
              default:break;
          }
          return calc(s.substring(flag), result);
        }

    }

}

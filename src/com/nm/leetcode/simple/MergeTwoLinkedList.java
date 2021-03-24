package com.nm.leetcode.simple;

import java.util.List;

/**
 * 合并两个升序链表
 *
 * @Author NM
 * @Date 2021/3/24 19:09
 */
public class MergeTwoLinkedList {

//    将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
//    示例 1：
//    输入：l1 = [1,2,4], l2 = [1,3,4]
//    输出：[1,1,2,3,4,4]
//    示例 2：
//    输入：l1 = [], l2 = []
//    输出：[]
//    示例 3：
//    输入：l1 = [], l2 = [0]
//    输出：[0]

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) { // 1124 34
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        while (l2 != null){
            int val1 = l1.val;
            int nextval1 = l1.next.val;
            int val2 = l2.val;
            if(val1 <= val2 && val2 <= nextval1){
                ListNode temp = l1.next;
                ListNode temp2 = l2.next;
                l1.next = l2;
                l2.next = temp;
                l2 = temp2;
            }else{

            }
        }
        return l1;
    }



    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        new MergeTwoLinkedList().mergeTwoLists(l1, l2);
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}

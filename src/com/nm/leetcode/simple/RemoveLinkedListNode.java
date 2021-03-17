package com.nm.leetcode.simple;

/**
 * 删除单链表里的节点
 *
 * @Author NM
 * @Date 2021/3/17 12:36
 */
public class RemoveLinkedListNode {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // 40min做完，前面没想明白，后面看了LinkedList的remove方法，有了大概思路。
    // 双指针前后节点，中间等于的话就把前后勾连上就ok了，递归循环往复。
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val){
            return head.next;
        }
        del(head, head.next, val);
        return head;
    }

    private void del(ListNode prevNode, ListNode currNode, int val) {
        if(currNode.val == val){
            prevNode.next = currNode.next;
        }else{
            del(currNode, currNode.next, val);
        }
    }


}

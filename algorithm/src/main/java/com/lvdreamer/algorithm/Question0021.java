package com.lvdreamer.algorithm;

import java.util.Stack;

/**
 * 21. 合并两个有序链表
 * <p>
 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

 示例：

 输入：1->2->4, 1->3->4
 输出：1->1->2->3->4->4

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question0021 {

    public static void main(String[] args) {
        ListNode l1=new Question0002().stringToListNode("[1,2,4]");
        ListNode l2=new Question0002().stringToListNode("[1,3,4]");
        ListNode res = new Question0021().mergeTwoLists(l1,l2);
        System.out.println(Question0002.listNodeToString(res));

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode newHead = null;
        if(l1.val < l2.val){
            newHead = l1;
            newHead.next = mergeTwoLists(l1.next, l2);
        } else{
            newHead = l2;
            newHead.next = mergeTwoLists(l1, l2.next);
        }
        return newHead;
    }
}

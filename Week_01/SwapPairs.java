package com.company.oneWeek.swapPairs20200521;

import java.util.List;

public class SwapPairs {

    public static void main(String[] args) {

//        ListNode listNode11 = new ListNode(1);
//        ListNode listNode12 = new ListNode(2);
//        ListNode listNode13 = new ListNode(3);
//        ListNode listNode14 = new ListNode(4);
//        listNode11.next = listNode12;
//        listNode12.next = listNode13;
//        listNode13.next = listNode14;
     }


    public  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }




    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}

package com.company.oneWeek.mergeTwoLists20200522;

public class MergeTwoLists {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummyHand = new ListNode(0);
            ListNode tail = dummyHand;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    tail.next = l1;
                    l1 = l1.next;
                } else {
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }
            tail.next = l1 == null ? l2 : l1;
            return dummyHand.next;
        }
    }


}

package com.example.org;

public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middlePointer = head;
        ListNode fastPointer = head;
        ListNode previousToMiddle = null;
        while (fastPointer != null && fastPointer.next != null) {
            previousToMiddle = middlePointer;
            middlePointer = middlePointer.next;
            fastPointer = fastPointer.next.next;
        }
        previousToMiddle.next = null;
        ListNode rightSorted = sortList(middlePointer);
        ListNode leftSorted = sortList(head);

        return merge(leftSorted, rightSorted);
    }

    private ListNode merge(ListNode leftSorted, ListNode rightSorted) {
        if (leftSorted == null) {
            return rightSorted;
        }
        if (rightSorted == null) {
            return leftSorted;
        }
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (leftSorted != null && rightSorted != null) {
            if (leftSorted.val <= rightSorted.val) {
                tail.next = leftSorted;
                leftSorted = leftSorted.next;
            } else {
                tail.next = rightSorted;
                rightSorted = rightSorted.next;
            }
            tail = tail.next;
        }
        tail.next = (leftSorted != null) ? leftSorted : rightSorted;
        return dummy.next;
    }
}

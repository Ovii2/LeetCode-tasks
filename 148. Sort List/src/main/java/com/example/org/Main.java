package com.example.org;

public class Main {
    static void main() {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);

        node1.next = node2;
        ListNode sortedHead = solution.sortList(node1);

        while (sortedHead != null) {
            IO.println(sortedHead.val);
            sortedHead = sortedHead.next;
        }
    }
}

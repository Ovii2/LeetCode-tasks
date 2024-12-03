package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> result = new HashSet<>();

        while (head != null) {
            if (result.contains(head)) {
                return true;
            }
            result.add(head);
            head = head.next;
        }
        return false;
    }
}

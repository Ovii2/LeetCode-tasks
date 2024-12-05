package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (var num : nums) {
            if (!result.add(num)) {
                return true;
            }
        }
        return false;
    }
}

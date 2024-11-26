package org.example.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 3, 4};
        int uniqueCount = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, uniqueCount)));

    }
}
package com.example.org;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPosition;
        int lastPosition;
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        firstPosition = findBoundary(nums, target, true);
        lastPosition = findBoundary(nums, target, false);
        return new int[]{firstPosition, lastPosition};
    }

    public int findBoundary(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int boundaryIndex = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                boundaryIndex = middle;
                if (findFirst) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return boundaryIndex;
    }
}

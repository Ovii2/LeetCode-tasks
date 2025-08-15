package org.example;

public class Solution {
    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }
}

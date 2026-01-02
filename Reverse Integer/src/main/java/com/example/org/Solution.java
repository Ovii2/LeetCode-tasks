package com.example.org;

public class Solution {
    public int reverse(int x) {
        StringBuilder result = new StringBuilder();
        String num = String.valueOf(Math.abs(x));

        result.append(num).reverse();
        result = x < 0 ? result.insert(0, "-") : result;

        try {
            return Integer.parseInt(result.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

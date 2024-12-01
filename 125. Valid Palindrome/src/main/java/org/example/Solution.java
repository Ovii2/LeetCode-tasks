package org.example;

public class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return result.contentEquals(new StringBuilder(result).reverse().toString());
    }
}

package org.example;

public class Solution {
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        var chars = s.toCharArray();

        while (start < end) {
            if (vowels.indexOf(chars[start]) == -1) {
                start++;
            } else if (vowels.indexOf(chars[end]) == -1) {
                end--;
            } else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }
}

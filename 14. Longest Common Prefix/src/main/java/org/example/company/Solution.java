package org.example.company;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (String s : strs) {
            while (!s.startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
}

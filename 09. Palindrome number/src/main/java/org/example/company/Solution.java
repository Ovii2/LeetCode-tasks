package org.example.company;

public class Solution {

    public boolean isPalindrome(int x) {

        StringBuilder sb = new StringBuilder();
        sb.append(x);
        return sb.toString().contentEquals(sb.reverse().toString());
    }
}

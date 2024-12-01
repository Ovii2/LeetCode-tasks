package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("0P"));
        System.out.println(solution.isPalindrome("A man, a plan, a canal -- Panama"));
    }
}

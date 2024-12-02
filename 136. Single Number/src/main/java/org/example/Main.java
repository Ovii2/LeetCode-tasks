package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test1 = new int[]{2, 2, 1};
        int[] test2 = new int[]{4, 1, 2, 1, 2};
        int[] test3 = new int[]{1};

        System.out.println(solution.singleNumber(test1));
        System.out.println(solution.singleNumber(test2));
        System.out.println(solution.singleNumber(test3));

    }
}
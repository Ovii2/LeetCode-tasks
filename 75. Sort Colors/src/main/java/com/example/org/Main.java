package com.example.org;

public class Main {
    static void main() {
        Solution solution = new Solution();
        var arr = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors(arr);
        for (int num : arr) {
            IO.println(num);
        }
    }
}

package org.example;

import java.util.Arrays;

public class Solution {
    public static int addDigits(int num) {
        return num >= 10 ? addDigits(Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt)
                .sum()) : num;
    }
}

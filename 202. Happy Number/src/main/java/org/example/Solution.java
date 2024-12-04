package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> result = new HashSet<>();
        if (n == 1) {
            return true;
        }
        while (n != 1 && !result.contains(n)){
            result.add(n);

            n = getNextNumber(n);
        }

        return n == 1;
    }

    public int getNextNumber(int n) {
        int total = 0;

        while (n > 0) {
            int digit = n % 10;
            total += digit * digit;
            n /= 10;
        }
        return total;
    }
}
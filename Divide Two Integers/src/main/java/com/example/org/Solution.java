package com.example.org;

import java.math.BigInteger;

public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        BigInteger dividendBigInt = BigInteger.valueOf(dividend);
        BigInteger divisorBigInt = BigInteger.valueOf(divisor);

        BigInteger result = dividendBigInt.divide(divisorBigInt);

        return result.intValue();
    }
}

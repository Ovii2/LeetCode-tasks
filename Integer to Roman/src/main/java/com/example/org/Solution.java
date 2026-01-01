package com.example.org;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        TreeMap<Integer, String> numbers = new TreeMap<>(Map.ofEntries(
                Map.entry(1, "I"),
                Map.entry(5, "V"),
                Map.entry(4, "IV"),
                Map.entry(9, "IX"),
                Map.entry(10, "X"),
                Map.entry(40, "XL"),
                Map.entry(50, "L"),
                Map.entry(90, "XC"),
                Map.entry(100, "C"),
                Map.entry(400, "CD"),
                Map.entry(500, "D"),
                Map.entry(900, "CM"),
                Map.entry(1000, "M")
        ));
        while (num > 0) {
            var entry = numbers.floorEntry(num);
            result.append(entry.getValue());
            num -= entry.getKey();

        }
        return result.toString();
    }
}

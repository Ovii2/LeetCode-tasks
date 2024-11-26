package org.example.company;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                list.add(')');
            } else if (c == '{') {
                list.add('}');
            } else if (c == '[') {
                list.add(']');
            } else if (list.isEmpty()) {
                return false;
            } else {
                if (list.removeLast() != c) {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }
}

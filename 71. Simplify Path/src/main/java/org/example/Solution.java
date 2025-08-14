package org.example;

import java.util.ArrayDeque;

public class Solution {
    public String simplifyPath(String path) {
        ArrayDeque<String> d = new ArrayDeque<>();
        for (String s : path.split("/"))
            if (s.equals("..")) {
                if (!d.isEmpty()) {
                    d.pollLast();
                }
            } else if (!s.isEmpty() && !s.equals(".")) d.offer(s);
        return "/" + String.join("/", d);
    }
}

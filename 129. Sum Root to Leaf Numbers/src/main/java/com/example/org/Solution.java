package com.example.org;

public class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode node, int currentNumber) {
        if (node == null) {
            return 0;
        }
        currentNumber = currentNumber * 10 + node.val;
        return node.left == null && node.right == null ? currentNumber : dfs(node.left, currentNumber) + dfs(node.right, currentNumber);
    }
}

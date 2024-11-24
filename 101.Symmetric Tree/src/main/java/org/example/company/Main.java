package org.example.company;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode test = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        TreeNode test2 = new TreeNode(2, new TreeNode(4, new TreeNode(5), new TreeNode(6)),
                new TreeNode(6, new TreeNode(7), new TreeNode(8)));

        System.out.println(solution.isSymmetric(test));
        System.out.println(solution.isSymmetric(test2));
    }
}
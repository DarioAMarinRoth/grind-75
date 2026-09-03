package week2;

import entities.TreeNode;

public class W2E8 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int rightHeight = root.right != null ? getHeight(root.right) + 1 : 0;
        int leftHeight = root.left != null ? getHeight(root.left) + 1 : 0;
        int candidate = leftHeight + rightHeight;
        return Math.max(Math.max(diameterOfBinaryTree(root.right), diameterOfBinaryTree(root.left)), candidate);
    }

    static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.right == null && root.left == null) {
            return 0;
        }
        int rightHeight = root.right != null ? getHeight(root.right) : 0;
        int leftHeight = root.left != null ? getHeight(root.left) : 0;
        return Math.max(rightHeight, leftHeight) + 1;
    }
}

package week2;

import entities.TreeNode;

public class W2E10 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.right == null && root.left == null) {
            return 1;
        }
        int rightHeight = root.right != null ? maxDepth(root.right) : 0;
        int leftHeight = root.left != null ? maxDepth(root.left) : 0;
        return Math.max(rightHeight, leftHeight) + 1;
    }
}

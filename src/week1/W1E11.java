package week1;

import entities.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class W1E11 {



    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        int heightDiff = Math.abs(getHeight(root.left) - getHeight(root.right));
        return heightDiff <= 1 && isBalanced(root.left) && isBalanced(root.right);
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


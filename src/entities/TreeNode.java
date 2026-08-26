package entities;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    private Queue<TreeNode> uninitializedNodes;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int[] root) {
        this(root[0]);
        uninitializedNodes = new ArrayDeque<>();
        this.left = new TreeNode();
        this.right = new TreeNode();

        uninitializedNodes.add(this.left);
        uninitializedNodes.add(this.right);
        buildTree(root);
    }

    private void buildTree(int[] root) {
        int i = 1;
        int remainingValues = root.length - 3;
        while (!uninitializedNodes.isEmpty()) {
            TreeNode aux = uninitializedNodes.poll();
            if (i < root.length) {
                aux.val = root[i];

                if (remainingValues > 0) {
                    aux.left = new TreeNode();
                    uninitializedNodes.add(aux.left);
                    remainingValues--;
                }

                if (remainingValues > 0) {
                    aux.right = new TreeNode();
                    uninitializedNodes.add(aux.right);
                    remainingValues--;
                }
                i++;
            }
        }
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


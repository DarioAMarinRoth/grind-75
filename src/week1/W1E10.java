package week1;

import entities.TreeNode;

public class W1E10 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int l = Math.min(p.val, q.val);
        int r = Math.max(p.val, q.val);

        if (root.val > r) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < l) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return new TreeNode(root.val);
        }
    }
}

package week1;

import entities.TreeNode;

public class W1E6 {
    static void main() {
        TreeNode test = new TreeNode(new int[]{4,2,7,1,3,6,9});
        TreeNode ans = invertTree(test);
        IO.println(invertTree(ans));

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode ans = new TreeNode();
        ans.val = root.val;
        ans.left = invertTree(root.right);
        ans.right = invertTree(root.left);
        return ans;
    }
}
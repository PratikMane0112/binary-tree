/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// T-O(N) S-O(N)
class Solution {
    public int minDepth(TreeNode root) {
        int diameter = 0;
        if (root == null) return diameter;
        return dfs(root);
    }
    public int dfs(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        if (root.left == null && root.right == null) return 1;
        int left = dfs(root.left);
        int right = dfs(root.right);
        diameter = Math.max(diameter,1 + left + right);
        return 1 + Math.max(left, right);
    }
}
// TC: O(n), SC: O(n)

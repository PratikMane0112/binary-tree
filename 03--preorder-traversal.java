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
// TC: O(n), SC: O(n)
// ----------------------- Iteration ------------------
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        if (root == null) return preorder;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curr = root;
        while (!stack.isEmpty()) {
            curr = stack.pop();
            while (curr != null) {
                preorder.add(curr.val);
                if (curr.right != null)
                    stack.push(curr.right);
                curr = curr.left;
            }
        }
        return preorder;
    }
}
// ---------------------- Recursion -------------------
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }  
        ans.add(root.val);   
        ans.addAll(preorderTraversal(root.left));
        ans.addAll(preorderTraversal(root.right));
        
        return ans;
    }
}

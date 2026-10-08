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

class Solution {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       res = 0;
       dfs(root);
        return res;
    }

    public int dfs(TreeNode root){
        if (root == null) return 0;
        res = Math.max(res, (dfs(root.left) + dfs(root.right)));
        return Math.max(dfs(root.left), dfs(root.right)) + 1;
    }
}

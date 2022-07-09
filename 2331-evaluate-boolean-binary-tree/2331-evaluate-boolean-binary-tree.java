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
    public boolean evaluateTree(TreeNode root) {
        return check(root);
    }
    
    public boolean check(TreeNode root){
        if(root.left == null && root.right == null){
            if(root.val == 0) return false;
            else return true;    
        }
        
        boolean lf = check(root.right);
        boolean rt = check(root.left);
        
        return root.val==2 ? lf|rt : lf&rt;
        
    }
}
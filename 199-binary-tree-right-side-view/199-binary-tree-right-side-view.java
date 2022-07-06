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
    public List<Integer> rightSideView(TreeNode root) {
         Queue<TreeNode> q
            = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        q.add(root);
        while(q.size()>0){
            int t = q.size();
            while(t-->0){
                TreeNode temp = q.poll();
                if(temp.left!= null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                if(t == 0)ans.add(temp.val);
            }
        }
        return ans;
    }
}
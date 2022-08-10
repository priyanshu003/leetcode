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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return construct(nums , 0 , nums.length - 1);
        
    }
    
    public TreeNode construct(int a[] , int lo , int hi){
        if(lo > hi){
            return null;
        }
        int mid = (lo +hi)/2;
        int data = a[mid];
       
        TreeNode lc = construct(a , lo , mid-1);
        TreeNode rc  = construct(a,mid+1,hi);
        
        
         TreeNode node = new TreeNode(data , lc , rc);
        return node;
    }
}
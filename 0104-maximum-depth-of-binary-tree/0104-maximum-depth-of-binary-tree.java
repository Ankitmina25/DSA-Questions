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
    public int helper(TreeNode root,int count){
        int maxy=Integer.MIN_VALUE;
        if(root==null) return count;
            int left= helper(root.left,count+1);
            int right= helper(root.right,count+1);
            return  Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
       int maxy= helper(root,0);
        return maxy;
    }
}
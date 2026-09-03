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
    public int helperleft(TreeNode root,int count){
       if(root==null) return count;
       int l= helperleft(root.left,count+1);
       return l;
    }
    public int helperright(TreeNode root,int count){
        if(root==null) return count;
        int r=helperright(root.right,count+1);
        return r;
    }
    public int countNodes(TreeNode root) {
      if(root==null) return 0;
        int left= helperleft(root.left,0);
        int right=helperright(root.right,0);
        if(left==right){
            return (int) Math.pow(2,left+1)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
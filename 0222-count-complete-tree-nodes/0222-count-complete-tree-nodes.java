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
    public int leftH(TreeNode root,int count){
        if(root==null)return count;
       int left = leftH(root.left,count+1);
        return left;
    }
    public int righth(TreeNode root,int count){
        if(root==null) return count;
        int right= righth(root.right,count+1);
        return right;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left= leftH(root,0);
        int right=righth(root,0);
        if(left==right){
            return (1<<left)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
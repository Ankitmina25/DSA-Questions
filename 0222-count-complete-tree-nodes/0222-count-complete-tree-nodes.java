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
    public int left(TreeNode root,int count){
        if(root==null) return count;
        return left(root.left,count+1);
    }
    public int right(TreeNode root,int count){
        if(root==null) return count;
        return right(root.right,count+1);
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left= left(root.left,0);
        int right=right(root.right,0);
        if(left==right) return (int) Math.pow(2,left+1)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
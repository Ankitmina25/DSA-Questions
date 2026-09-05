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
   public int dia=0;
    public int lefttree(TreeNode root){
        if(root==null) return 0;
        int left= lefttree(root.left);
        int right=lefttree(root.right);
         dia=Math.max(left+right,dia);
        return 1+(int)Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        lefttree(root);
        return dia;
    }
}
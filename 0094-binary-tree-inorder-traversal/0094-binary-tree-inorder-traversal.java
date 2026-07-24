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
    public void inorderList(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorderList(root.left,list);
        list.add(root.val);
        inorderList(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inorderList(root,list);
        return list;
    }
}
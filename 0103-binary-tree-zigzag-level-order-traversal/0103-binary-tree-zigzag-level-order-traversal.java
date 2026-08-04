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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
        boolean flag= true;
        q.offer(root);
        while(!q.isEmpty()){
            int size= q.size();
            ArrayList<Integer> lvl= new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode curr = q.poll();
            if(flag)lvl.add(curr.val);
            else lvl.add(0,curr.val);
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
            }
            ans.add(lvl);
            flag=!flag;
        }
        return ans;
    }
}
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
       List<List<Integer>> list= new ArrayList<>();
       if(root==null) return list;
       Queue<TreeNode> q= new LinkedList<>();
       q.offer(root);
       boolean flag=true;
       while(!q.isEmpty()){
       List<Integer> level = new ArrayList<>();
       int size=q.size();
            for(int i=0;i<size;i++){
            TreeNode curr= q.poll();
            if(flag) level.add(curr.val);
            else level.add(0,curr.val);
            if(curr.left!=null)  q.offer(curr.left);
            if(curr.right!=null)  q.offer(curr.right);
            }
            list.add(level);
             flag = !flag;
        }
        return list;
    }
}
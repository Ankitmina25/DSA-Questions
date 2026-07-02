class Solution {
    public void helper(int [] candidates, List<List<Integer>> ans, ArrayList<Integer> curr, int target, int idx,int sum){
        if(sum>target) return ;
        if(idx==candidates.length) return ;
        if(sum==target){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(candidates[idx]);
        helper(candidates,ans,curr,target,idx,sum+candidates[idx]);
        curr.remove(curr.size()-1);
        helper(candidates,ans,curr,target,idx+1,sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> curr= new ArrayList<>();
        
        helper(candidates,ans,curr,target,0,0);
        return ans;
    }
}
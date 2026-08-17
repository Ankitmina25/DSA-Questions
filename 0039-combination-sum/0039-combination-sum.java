class Solution {
    public void helper(int[] candidates,int target,List<List<Integer>> ans, List<Integer> curr,int idx ,int sum){
        if(idx==candidates.length) return;
        if(sum>target) return;
        if(sum==target){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(candidates[idx]);
        helper(candidates,target,ans,curr,idx,sum+candidates[idx]);
        curr.remove(curr.size()-1);
        helper(candidates,target,ans,curr,idx+1,sum);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        helper(candidates,target,ans,curr,0,0);
        return ans;
    }
}
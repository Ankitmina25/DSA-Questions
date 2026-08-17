class Solution {
    public void helper(int[] nums,List<List<Integer>>ans,List<Integer> curr,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        helper(nums,ans,curr,idx+1);
        curr.remove(curr.size()-1);
        helper(nums,ans,curr,idx+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        helper(nums,ans,curr,0);
        return ans;
    }
}
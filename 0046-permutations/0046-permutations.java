class Solution {
    public void helper(int [] nums, List<List<Integer>> ans, ArrayList<Integer>curr, ArrayList<Boolean> visited){
        if(curr.size()==nums.length){
                ans.add(new ArrayList<>(curr));
                return;
        }
        for(int i=0; i<nums.length;i++){
            if(visited.get(i)){
                continue;
            }
            curr.add(nums[i]);
            visited.set(i,true);
            helper(nums,ans,curr,visited);
            curr.remove(curr.size()-1);
            visited.set(i,false);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Boolean> visited=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            visited.add(false);
        }
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        helper(nums,ans,curr,visited);
        return ans;
    }
}
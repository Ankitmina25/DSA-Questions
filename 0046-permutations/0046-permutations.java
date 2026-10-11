class Solution {
    public void helper(int[] nums,List<List<Integer>>ans,ArrayList<Integer>curr,boolean[] visit){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visit[i]==true) continue;
            visit[i]=true;
            curr.add(nums[i]);
            helper(nums,ans,curr,visit);
            curr.remove(curr.size()-1);
            visit[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visit= new boolean[nums.length];
        for(int i=0;i<visit.length;i++){
            visit[i]=false;
        }
        List<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer>curr = new ArrayList<>();
        helper(nums,ans,curr,visit);
        return ans;
    }
}
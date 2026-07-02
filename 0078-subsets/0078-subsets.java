class Solution {
    public void helper(int [] nums, List<List<Integer>>list, ArrayList<Integer> curr,int idx){
        if(idx==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        helper(nums,list,curr,idx+1);
        curr.remove(curr.size()-1);
        helper(nums,list,curr,idx+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        helper(nums,list,curr,0);
        return list;
        
    }
}
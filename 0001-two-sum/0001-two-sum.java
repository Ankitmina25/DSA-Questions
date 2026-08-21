class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans= new HashMap<>();
        int [] arr= new int[2];
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(ans.containsKey(diff)){
                arr[0]=ans.get(diff);
                arr[1]=i;
            }
            ans.put(nums[i],i);
        }
        return arr;
    }
}
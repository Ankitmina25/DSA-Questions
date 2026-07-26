class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for( int it: freq.values()){
            if(it>1) return true;
        }
        return false;
    }
}
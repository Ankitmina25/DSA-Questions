class Solution {
    public int[] runningSum(int[] nums) {
        // int [] arr= new int[nums.length];
        // int left=nums[0];
        // arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
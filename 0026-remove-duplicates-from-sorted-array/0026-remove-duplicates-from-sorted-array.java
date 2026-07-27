class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int count=1;
        int right=1;
        while(right<nums.length){
            if(nums[left]!=nums[right]){
                nums[left+1]=nums[right];
                count++;
                left++;
                right++;
            }
            while(right<nums.length && nums[right]==nums[left]){
                right++;
            }
        }
        return count;
    }
}
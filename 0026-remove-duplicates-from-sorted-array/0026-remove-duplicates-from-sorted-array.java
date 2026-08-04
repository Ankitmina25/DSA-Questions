class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[left]!=nums[i]){
                count++;
                nums[left+1]=nums[i];
                left++;
            }
        }
    return count;
    }
}
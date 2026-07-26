class Solution {
    public void moveZeroes(int[] nums) {
       
        for(int i=0;i<nums.length-1;i++){
             int left=i;
             int right=i+1;
                while(right<nums.length){
                if(nums[left]==0 && nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
                }
                right++;
            }
        }
    }
}
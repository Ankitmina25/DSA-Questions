class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int count=0;
        int maxy= Integer.MIN_VALUE;
        while(right<nums.length){
            if(nums[right]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            maxy=Math.max(right-left+1,maxy);
            right++;
        }
        return maxy;
    }
}
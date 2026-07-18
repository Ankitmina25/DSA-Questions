class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        int sum=0;
        while(right<nums.length){
            if(right-left+1>k){
                sum-=nums[left];
                left++;
            }
            sum+=nums[right];
            if(right-left+1==k)  ans=Math.max(sum,ans);
            right++;
        }
        return ans/k;
    }
}
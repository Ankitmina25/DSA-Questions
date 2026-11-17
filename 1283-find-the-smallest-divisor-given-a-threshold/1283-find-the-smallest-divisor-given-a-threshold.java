class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for(int i=0;i<nums.length;i++){
            right=Math.max(right,nums[i]);
        }
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                int val = nums[i]/mid;
                if(nums[i]%mid!=0){
                    val++;
                }
                sum+=val;
            }
            if(sum<=threshold){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
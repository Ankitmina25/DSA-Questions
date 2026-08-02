class Solution {
    public int splitArray(int[] nums, int k) {
        int left= Integer.MIN_VALUE;
        int right=0;
        for(int i=0;i<nums.length;i++){
            left=Math.max(left,nums[i]);
            right+=nums[i];
        }
        int ans=0;
        while(left<=right){
            int mid= left+(right-left)/2;
            int sum=0;
            int count=1;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>mid){
                    count++;
                    sum=nums[i];
                }
            }
            if(count<=k){
                    ans=mid;
                    right=mid-1;    
            }else left=mid+1;
        }
        return ans;
    }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(left,weights[i]);
            right+=weights[i];
        }
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum=0;
            int count=1;
            for(int i=0;i<weights.length;i++){
                sum+=weights[i];
                if(sum>mid){
                    count++;
                    sum=weights[i];
                }
            }
            if(count<=days){
                ans=mid;
                right=mid-1;
            }else left=mid+1;
        }
        return ans;
    }
}
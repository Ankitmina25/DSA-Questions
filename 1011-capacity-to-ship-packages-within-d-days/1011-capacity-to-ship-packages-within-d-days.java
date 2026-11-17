class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        int ans=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(left,weights[i]);
            right+=weights[i];
        }
        while(left<=right){
            int mid=(left+right)/2;
            int d=1;
            int sum=0;
            for(int i=0;i<weights.length;i++){
                sum+=weights[i];
                if(sum>mid){
                    d++;
                    sum=weights[i];
                }
            }
            if(d<=days){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
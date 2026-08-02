class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Integer.MIN_VALUE;
        int right=0;
        int ans=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(left,weights[i]);
            right+=weights[i];
        }
        while(left<=right){
            int mid= left+(right-left)/2;
            int sum=0;
            int count=0;
            for(int i=0;i<weights.length;i++){
                sum+=weights[i];
                if(sum>mid){
                    count++;
                    sum=weights[i];
                } 
            }
            if(count<days){
                right=mid-1;
                ans=mid;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
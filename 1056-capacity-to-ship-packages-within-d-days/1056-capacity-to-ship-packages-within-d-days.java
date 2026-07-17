class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(weights[i],left);
            right+=weights[i];
       }
       int miny=Integer.MAX_VALUE;
       while(left<=right){
        int mid = (left+right)/2;
        int count=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
             sum+=weights[i];
            if(sum>mid){
                count++;
                sum=weights[i];
            }
        }
        if(count<=days){
            right=mid-1;
            miny=mid;
        }else{
            left=mid+1;
        }
       }
        return miny;
    }
}
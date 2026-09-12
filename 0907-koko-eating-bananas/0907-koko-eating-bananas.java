class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            right=Math.max(right,piles[i]);
        }
        while(left<=right){
            int mid= (left+right)/2;
            long need=0;
            for(int i=0;i<piles.length;i++){
                need+=piles[i]/mid;
                if(piles[i]%mid!=0) need++;
            }
            if(need<=h){
                ans=mid;
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return ans;
    }
}
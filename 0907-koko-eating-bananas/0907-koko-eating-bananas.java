class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            right=Math.max(right,piles[i]);
        }
        while(left<=right){
            int mid =  left+(right-left)/2;
            long hr=0;
            for(int i=0;i<piles.length;i++){
                hr+=piles[i]/mid;
                if(piles[i]%mid!=0){
                    hr++;
                }
            }
            if(hr<=h){
                right=mid-1;
                ans=mid;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
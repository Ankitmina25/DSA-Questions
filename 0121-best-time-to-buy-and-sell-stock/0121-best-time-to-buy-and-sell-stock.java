class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int miny=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(miny>prices[i]){
                miny=prices[i];
            }
            int sum= prices[i]-miny;
            if(sum>ans){
            ans=sum;
        }
        }
        return ans;
        
    }
}
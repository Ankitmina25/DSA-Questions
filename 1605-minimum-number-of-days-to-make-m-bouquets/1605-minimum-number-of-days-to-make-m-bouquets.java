class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int[] bloom = new int[bloomDay.length];
        int left = Integer.MAX_VALUE;
        int right = 0;
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            left=Math.min(left,bloomDay[i]);
             right = Math.max(right, bloomDay[i]);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    bloom[i]=1;
                }else{
                    bloom[i]=0;
                }
            }
            int count=0;
            int boq=0;
            for(int i=0;i<bloom.length;i++){
                if(bloom[i]==1) count++;
                if(count==k){
                    boq++;
                    count=0;
                }
                if(bloom[i]==0) count=0;
            }
            if(boq>=m){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int [] arr=new int[bloomDay.length];
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        int ans=0;
        if(arr.length<(long)m*k) return -1;
        for(int i=0;i<bloomDay.length;i++){
            left=Math.min(bloomDay[i],left);
            right=Math.max(bloomDay[i],right);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            for(int i=0;i<bloomDay.length;i++){
                    if(bloomDay[i]<=mid){
                        arr[i]=1;
                    }else arr[i]=0;
            }
            int boq=0;
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==1) count++;
                if(count==k){
                    boq++;
                    count=0;
                }
                else if(arr[i]==0) count=0;
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
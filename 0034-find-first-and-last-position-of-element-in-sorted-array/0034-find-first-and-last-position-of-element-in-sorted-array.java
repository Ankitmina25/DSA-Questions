class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr= {-1,-1};
        int left=0;
        int right= nums.length-1;
        while(left<=right){
            int mid= (left+right)/2;
            if(target==nums[mid]){
                arr[0]=mid;
                right=mid-1;
            }else{
                if(target<nums[mid]) right=mid-1;
                else left=mid+1;
            }
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid= (left+right)/2;
            if(target==nums[mid]){
                arr[1]=mid;
                left=mid+1;
            }else{
                if(target<nums[mid]) right=mid-1;
                else left=mid+1;
            }
        }
        return arr;
    }
}
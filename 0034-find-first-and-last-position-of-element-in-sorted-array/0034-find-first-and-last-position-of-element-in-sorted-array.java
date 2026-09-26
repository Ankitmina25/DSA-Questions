class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int [] arr= new int[2];
        arr[0]=-1;
        arr[1]=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>nums[mid]) left=mid+1;
            else if(target<nums[mid]) right=mid-1;
            else {
                arr[0]=mid;
                right=mid-1;
            }
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>nums[mid]){
                left=mid+1;
            } else if(target<nums[mid]){
                right=mid-1;
            }else{
                arr[1]=mid;
                left=mid+1;
            }
        }
        return arr;
    }
}
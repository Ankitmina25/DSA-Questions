class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1;
        int arr[]=new int[nums.length];
        while(left<=right){
            int leftsum=nums[left]*nums[left];
            int rightsum=nums[right]*nums[right];
            if(rightsum>leftsum){
                arr[i]=rightsum;
                right--;
                i--;
            }else {
                arr[i]=leftsum;
                left++;
                i--;
            }
        }
        return arr;
    }
}
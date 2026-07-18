class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxy= Integer.MIN_VALUE;
        int high=Integer.MAX_VALUE;
       
        while(left<right){
            high=Math.min(height[left],height[right]);
            int area= high*(right-left);
            maxy=Math.max(maxy,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxy;
    }
}
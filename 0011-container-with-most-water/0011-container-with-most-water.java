class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        while(left<right){
            int miny= Math.min(height[left],height[right]);
            int curr= miny*(right-left);
            area= Math.max(curr,area);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return area;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] nums = new int[nums1.length+nums2.length];
       int n1=0;
       int n2=0;
       int k=0;
       while(n1<nums1.length && n2<nums2.length){
        if(nums1[n1]<=nums2[n2]){
            nums[k]=nums1[n1];
            n1++;
            k++;
        }else{ 
            nums[k]=nums2[n2];
            n2++;
            k++;
            }
       }
       while(n1<nums1.length){
        nums[k]=nums1[n1];
        n1++;
        k++;
       }
       while(n2<nums2.length){
        nums[k]=nums2[n2];
        n2++;
        k++;
       }
       if(nums.length%2!=0){
            return (double) nums[nums.length/2];
       }else{
        int mid=nums.length/2;
        return ((double) nums[mid-1] + nums[mid])/2;
       }
    }
}
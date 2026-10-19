class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left=0;
        int right=0;
        while(left<nums1.length && right< nums2.length){
            if(nums1[left]<=nums2[right]){
            ans.add(nums1[left]);
            left++;
            }
            else{
                 ans.add(nums2[right]);
                 right++;
            }
        }
        while(left<nums1.length){
            ans.add(nums1[left]);
            left++;
        }
        while(right<nums2.length){
            ans.add(nums2[right]);
            right++;
        }
         double val =0;
         int mid=(left+right)/2;
        if(ans.size()%2==0){
            val= (ans.get(mid)+ans.get(mid-1))/2.0;
        }else{
            val=ans.get(mid);
        }
        return val;
    }
}
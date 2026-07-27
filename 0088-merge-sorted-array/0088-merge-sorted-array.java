class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0;
        int right=0;
        ArrayList<Integer> arr= new ArrayList<>();
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                arr.add(nums1[left]);
                left++;
            }
            else{
                arr.add(nums2[right]);
                right++;
            }
        }
        while(left<m){
            arr.add(nums1[left]);
            left++;
        }
        while(right<n){
            arr.add(nums2[right]);
            right++;
        }
        for(int i=0;i<arr.size();i++){
            nums1[i]=arr.get(i);
        }
    }
}
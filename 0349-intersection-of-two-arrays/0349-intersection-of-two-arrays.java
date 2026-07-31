class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            HashMap<Integer,Integer> map =new HashMap<>();
            for(int i=0;i<nums1.length;i++){
                map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
            }
            int arr[]= new int[Math.min(nums1.length, nums2.length)];
            int count=0;
            for (int i=0;i<nums2.length;i++){
                if(map.containsKey(nums2[i])){
                    arr[count]=nums2[i];
                    count++;
                    map.remove(nums2[i]);
                }
            }
            int ans[]= Arrays.copyOf(arr,count);
            return ans;
    }
}
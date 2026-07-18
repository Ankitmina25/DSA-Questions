class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int left=i-1;
            int right=i+1;
            int prefix=0;
            int suffix=0;
            while(left>=0){
                prefix+=nums[left];
                left--;
            }
            while(right<=nums.length-1){
                suffix+=nums[right];
                right++;
            }
                if(prefix==suffix) {
                    return i;
                }
            
        }
        return -1;
    }
}
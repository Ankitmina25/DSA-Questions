class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] prefix= new int[nums.length];
        prefix[0]=0;
        int [] suffix= new int[nums.length];
        suffix[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            int left=i-1;
            int sum=0;
            while(left>=0){
                sum+=nums[left];
                left--;
            }
            prefix[i]=sum;
        }
        for(int i=nums.length-2;i>=0;i--){
            int right=i+1;
            int sum=0;
            while(right<nums.length){
                sum+=nums[right];
                right++;
            }
            suffix[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(prefix[i]-suffix[i]);
        }
        return nums;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int size= nums.length;
        int ans=0;
        for(int i=0;i<=size;i++){
            boolean find= false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    find=true;
                    break;
                }
            }
            if(find==false) ans=i;
        }
        return ans;
    }
}
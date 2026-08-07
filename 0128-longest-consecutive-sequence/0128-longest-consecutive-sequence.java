class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }

        int ans=0;

        for(int it : map){
            if(!map.contains(it-1)){
                 int curr=it;
                 int count=1;
                 while(map.contains(curr+1)){
                    curr++;
                    count++;
                }
                 ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
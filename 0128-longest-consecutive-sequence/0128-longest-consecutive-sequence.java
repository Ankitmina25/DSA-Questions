class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map =new HashSet<>();
        int longest=0;
       
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        for(int num: map){
            if(!map.contains(num-1)){
            int count=1;
            int curr= num;
            while(map.contains(curr+1)){
                count++;
                curr++;
                 }
            longest=Math.max(count,longest);
            }
            }

        return longest;
    }
}
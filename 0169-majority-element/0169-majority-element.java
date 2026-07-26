class Solution {
    public int majorityElement(int[] nums) {
            HashMap<Integer,Integer> freq= new HashMap<>();
            int ans=0;
            int maxfreq=0;
            for(int i=0;i<nums.length;i++){
                freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
            }
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue()>maxfreq){
                maxfreq=entry.getValue();
                ans=entry.getKey();
            }
}
            return ans;
    }
}
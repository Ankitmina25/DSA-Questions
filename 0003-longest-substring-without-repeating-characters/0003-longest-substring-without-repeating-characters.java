class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        
        int left=0;
        int right=0;
        int len= Integer.MIN_VALUE;
        while(right<s.length()){
            char ch= s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>1){
                while(map.get(ch)>1){
                    char lc= s.charAt(left);
                    map.put(lc,map.get(lc)-1);
                    left++;
                }
            }
            len= Math.max(len,(right-left)+1);
            right++;
        }
        if(len==Integer.MIN_VALUE) return 0;
        return len;
        
    }
}
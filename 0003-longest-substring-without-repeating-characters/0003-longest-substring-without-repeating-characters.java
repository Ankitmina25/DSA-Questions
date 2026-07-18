class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int longest= 0;
        while(right<s.length()){
            char ch= s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char c= s.charAt(left);
                map.put(c,map.get(c)-1);
                left++;
            }
            longest=Math.max(longest,right-left+1);
            right++;
        }
        return longest;
        
    }
}
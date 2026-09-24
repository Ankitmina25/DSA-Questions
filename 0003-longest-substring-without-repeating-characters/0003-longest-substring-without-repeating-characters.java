class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int len=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            while(map.containsKey(ch)){
                char c=s.charAt(left);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
                left++;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            len=Math.max(len,(right-left)+1);
            right++;
        }
        return len;
    }
}
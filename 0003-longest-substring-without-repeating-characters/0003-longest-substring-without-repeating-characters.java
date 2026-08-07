class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int len=0;
        while(right<s.length()){
            char ch= s.charAt(right);
            while(map.containsKey(ch)){
                char chl=s.charAt(left);
                map.put(chl,map.get(chl)-1);
                if(map.get(chl)==0){
                    map.remove(chl);
                }
                left++;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}
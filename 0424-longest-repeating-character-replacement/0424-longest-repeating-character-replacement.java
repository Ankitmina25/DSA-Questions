class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map= new HashMap<>();
        int maxFreq= Integer.MIN_VALUE;
        int left=0;
        int right=0;
        int ans=0;
        while(right<s.length()){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq= Math.max(maxFreq,map.get(ch));
            if(((right-left)+1)-maxFreq>k){
                char c= s.charAt(left);
                map.put(c,map.get(c)-1);
                left++;
            } 
            ans=Math.max(ans,(right-left)+1);
            right++;
        }
        return ans;
    }
}
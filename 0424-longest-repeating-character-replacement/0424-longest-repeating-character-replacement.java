class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=0;
        int left=0;
        int right=0;
        int mxFreq=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            mxFreq=Math.max(mxFreq,map.get(ch));
            while(((right-left)+1)-mxFreq>k){
                char c= s.charAt(left);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
                left++;
            }
            len=Math.max(len,(right-left)+1);
            right++;
        }
        return len;
    }
}
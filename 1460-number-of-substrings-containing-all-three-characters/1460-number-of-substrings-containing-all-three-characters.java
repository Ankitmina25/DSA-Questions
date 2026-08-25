class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                ans+=s.length()-i;
                char lch= s.charAt(left);
                map.put(lch,map.get(lch)-1);
                if(map.get(lch)==0){
                    map.remove(lch);
                }
                left++;
            }
        }
        return ans;
    }
}
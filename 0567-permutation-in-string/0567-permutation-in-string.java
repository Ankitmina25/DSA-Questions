class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0;
        int right=0;
        while(right<s2.length()){
            char c= s2.charAt(right);
            map2.put(c,map2.getOrDefault(c,0)+1);
            if(right-left+1>s1.length()){
                char cl= s2.charAt(left);
                map2.put(cl,map2.get(cl)-1);
                if(map2.get(cl)==0) map2.remove(cl);
                    left++;
            } 
            if((right-left)+1==s1.length()){
                if(map2.equals(map)) return true;
            }
            right++;
        }
        return false;
    }
}
class Solution {
    // public boolean allZero(HashMap<Character,Integer> map){
    //     for(int i : map.values()){
    //         if(i!=0) return false;
    //     }
    //     return true;
    // }
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int size=s1.length();
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(right<s2.length()){
            char ch=s2.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(right-left+1>size){
                char c= s2.charAt(left);
                map.put(c,map.get(c)+1);
                left++;
            }
            int check=0;
            for(int i : map.values()){
                if(i!=0) check=1;
            }
            if(right-left+1==size && check==0) return true;
            right++;
        }
        return false;
    }
}
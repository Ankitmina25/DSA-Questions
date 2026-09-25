class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words= s.split(" ");
        HashMap<Character,String> map= new HashMap<>();
        HashMap<String,Character> rmap=new HashMap<>();
        if(pattern.length()!=words.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String c=words[i];
            if(map.containsKey(ch) && !map.get(ch).equals(c)) return false;
            if(rmap.containsKey(c) && rmap.get(c)!=ch) return false;
             map.put(ch,c);
             rmap.put(c,ch);
        }
        return true;
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1= new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();       
          String [] words= s.split(" ");
            if(pattern.length()!=words.length) return false;
            for(int i=0;i<pattern.length();i++){
            char ch= pattern.charAt(i);
            String word= words[i];
            if(!map1.containsKey(ch) && !map2.containsKey(word)){
                map1.put(ch,word);
                map2.put(word,ch);
            }
            else if(map1.containsKey(ch) && map2.containsKey(word)) {
               if (!map1.get(ch).equals(word) || !map2.get(word).equals(ch)){
                return false;
               }
            }
            else {
                return false;
            }
        }
        return true;
    }
}
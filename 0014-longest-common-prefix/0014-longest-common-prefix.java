class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix= strs[0];
        for(int i=1;i<strs.length;i++){
            String str="";
            String curr= strs[i];
            int miny=Math.min(curr.length(),prefix.length());
            for(int j=0;j<miny;j++){
                    char ch= curr.charAt(j);
                    char pch=prefix.charAt(j);
                    if(ch!=pch){
                     break;
                    }
                       str+=ch;
            }
            prefix=str;
        }
        return prefix;
    }
}
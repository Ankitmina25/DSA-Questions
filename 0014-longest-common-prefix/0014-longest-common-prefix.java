class Solution {
    public String longestCommonPrefix(String[] strs) {
        String st=strs[0];
        for(int i=1;i<strs.length;i++){
            String strd="";
            String str=strs[i];
            int miny=Math.min(str.length(),st.length());
            for(int j=0;j<miny;j++){
                char ch=st.charAt(j);
                char c=str.charAt(j);
                if(ch!=c) break;
                strd+=ch;
            }
            st=strd;
        }
        return st;
    }
}
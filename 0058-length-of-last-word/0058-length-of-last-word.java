class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        String st="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch== ' ') break;
            st+=ch;
        }
        return st.length();
    }
}
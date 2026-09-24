class Solution {
    public int compress(char[] chars) {
        int left=0;
        int right=0;
        String ans="";
        while(right<chars.length){
            char ch=chars[left];
            int  count=0;
            while(right<chars.length && chars[right]==chars[left]){
                count++;
                right++;
            }
            ans+=ch;
            if(count>1) ans+=count;
            left=right;
        }
        for(int i=0;i<ans.length();i++){
            chars[i]=ans.charAt(i);
        }
        return ans.length();
    }
}
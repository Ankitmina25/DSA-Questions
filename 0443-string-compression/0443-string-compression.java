class Solution {
    public int compress(char[] chars) {
        String str="";
        int left=0;
        int right=0;
        int count=0;
        while(right<chars.length){
            char letter = chars[right];
            if(chars[left]!=letter){
                str+=chars[left];
                if(count>1) str+=count;
                count=0;
                left=right;
            }
            count++;
            right++;
        }
        str+=chars[left];
        if(count>1) str+=count;
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}
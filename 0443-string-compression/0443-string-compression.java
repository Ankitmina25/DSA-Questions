class Solution {
    public int compress(char[] chars) {
        int left=0;
        int right=0;
        int write=0;
        int count=0;
        while(right<chars.length){
            chars[write]=chars[left];
                write++;
            while(right<chars.length &&  chars[right]==chars[left]){
                    count++;
                    right++;
            }
            if(count>1){
            if(count<=9){
                chars[write]=(char)(count+'0');
                write++;
            }else{
                String s= String.valueOf(count);
                for(int i=0;i<s.length();i++){
                    char ch= s.charAt(i);
                    chars[write]=ch;
                    write++;
                }
            }
            }
            count=0;
            left=right;
        }
        return write;
    }
}
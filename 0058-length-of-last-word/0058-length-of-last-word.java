class Solution {
    public int lengthOfLastWord(String s) {
        // String[] str=s.split(" +");
        // return str[str.length-1].length();
        s=s.trim();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                c++;
            }
            else if(c>0){
                break;
            }
        }
        return c;
    }
}
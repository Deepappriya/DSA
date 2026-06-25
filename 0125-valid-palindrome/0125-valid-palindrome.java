class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0,h=s.length()-1;
        while(l<h){
            char lc=s.charAt(l);
            char rc=s.charAt(h);
            if(Character.isLetterOrDigit(lc) && Character.isLetterOrDigit(rc)){
               if(lc!=rc)
                 return false;
                l++;h--;
            }
            else if(!Character.isLetterOrDigit(lc)){
                l++;
            }
            else {
                h--;
            }
            

        }
                    return true;
    }
}
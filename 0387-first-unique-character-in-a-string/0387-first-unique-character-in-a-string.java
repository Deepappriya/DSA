class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;

        // int[] a=new int[256];
        // for(int i=0;i<s.length();i++)
        //     a[s.charAt(i)]++;
        // for(int i=0;i<s.length();i++){
        //     if(a[s.charAt(i)]==1)
        //         return i;
        // }
        // return -1;
    }
}
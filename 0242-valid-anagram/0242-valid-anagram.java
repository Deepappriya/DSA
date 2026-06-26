class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] a=s.toCharArray();
        // char[] b=t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a,b);

        // if(s.length()!=t.length()) return false;
        // int[] a=new int[26];
        // for(int i=0;i<s.length();i++){
        //     a[s.charAt(i)-'a']++;
        //     a[t.charAt(i)-'a']--;
        // }
        // for(int i:a){
        //     if(i!=0)
        //     return false;
        // }
        // return true;

        if(s.length()!=t.length()) 
            return false;

        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();
        for(char c:s.toCharArray())
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        for(char c:t.toCharArray())
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        return hm1.equals(hm2);
    }
}
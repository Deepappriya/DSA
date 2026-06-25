class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int l=0,maxl=0;
        // Set<Character> a=new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     while(a.contains(s.charAt(i))){
        //         a.remove(s.charAt(l));
        //         l++;
        //     }
        //     a.add(s.charAt(i));
        //     maxl=Math.max(maxl,i-l+1);
        // }
        // return maxl;

        int l=0,maxl=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                l=Math.max(h.get(s.charAt(i))+1,l);
            }
            h.put(s.charAt(i),i);
            maxl=Math.max(maxl,i-l+1);
        }
        return maxl;
    }
}
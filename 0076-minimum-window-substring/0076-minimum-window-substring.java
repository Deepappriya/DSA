class Solution {
    public String minWindow(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        if(l1<l2) return "";
        HashMap<Character,Integer> ht=new HashMap<>();
        for(int i=0;i<l2;i++){
            char c=t.charAt(i);
            ht.put(c,ht.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> wp=new HashMap<>();
        int l=0,form=0,req=ht.size(),st=0,minl=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            wp.put(c,wp.getOrDefault(c,0)+1);
            if((ht.containsKey(c)) && (wp.get(c).intValue()==ht.get(c).intValue()))
                form++;
            while(form==req){
                if(r-l+1<minl){
                    minl=r-l+1;
                    st=l;
                }
                char lc=s.charAt(l);
                wp.put(lc,wp.get(lc)-1);
                if((ht.containsKey(lc)) && (wp.get(lc) < ht.get(lc))){
                    form--;
                }
                l++;
            }
        }
        return(minl==Integer.MAX_VALUE)?"": s.substring(st,st+minl);
    }
}
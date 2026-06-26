class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        int k=1;
        while(n>0){
            i++;
            n=n-k;
            k++;
        }
        return n==0?i:i-1;
    }
}
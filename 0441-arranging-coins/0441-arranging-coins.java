class Solution {
    public int arrangeCoins(int n) {
        // int i=0;
        // int k=1;
        // while(n>0){
        //     i++;
        //     n=n-k;
        //     k++;
        // }
        // return n==0?i:i-1;

        long l = 1, r = n;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long coins_needed = mid * (mid + 1) / 2;
            if (coins_needed == n) return (int) mid;
            else if (coins_needed < n) l = mid + 1;
            else r = mid - 1;
        }
        return (int) r;
    }
}
class Solution {
    // public static int fib(int n){
    //     if(n==1) return 1;
    //     else if (n==2) return 2;
    //     else return fib(n-1)+fib(n-2);
    // }
    public int climbStairs(int n) {
        int a=1,b=2,c=0;
        if(n==1 || n==2) return n;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
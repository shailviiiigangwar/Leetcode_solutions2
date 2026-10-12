class Solution {
    public int fib(int n) {
      //  int a = 0, b = 1;
        //while (n-- > 0) {
          //  int c = a + b;
            //a = b;
            //b = c;
      //  }
        //return a;
        //if(n<=1)return n;
        //return fib(n-1) + fib(n-2);
        //by using DP
        int dp[]=new int[n+1];
        return fab(n,dp);
    }
    int fab(int n,int dp[]){
        if(n<=1)return n;
        if(dp[n]!=0)return dp[n];
        return dp[n]= fab(n-1, dp)+fab(n-2, dp);
    }
}

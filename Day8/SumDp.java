import java.util.Arrays;

public class SumDp {
    static  int ways(int n, int[] dp)
{
      if (n==0) return 0;
      if (dp[n]!=-1) {
        return dp[n];
      }
      dp[n]=n%10+ways(n/10, dp);
      return dp[n];
}
    public static void main(String[] args) {
        int n = 123456;
        int []dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(ways(n, dp));
    }
}

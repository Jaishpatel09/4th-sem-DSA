package Day11;
import java.util.Arrays;
public class SubArraySum {
    static int [][] dp=new int[100][100];
    static int MinSteps(int[] arr,int i,int k){
        if (k==0) return 1;
        if(i==arr.length) return 0;
        if(dp[i][k] != -1) return dp[i][k];
        int x=0;
        if (arr[i]<= k) {
            x=MinSteps(arr, i+1, k-arr[i]);
        }
        int y=MinSteps(arr, i+1, k);
        dp[i][k] = x+y;
        return dp[i][k];
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        int i=0;
        int k=3;

        System.out.println(MinSteps(arr, i, k));

    }
}

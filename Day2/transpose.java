

public class transpose {
    public static void main(String[] args) {
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
        }
        System.out.println(sum);
        int[][] transpose = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transpose[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(transpose[i][j]+" ");
            }
        }
    }
}

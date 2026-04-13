package Day5;

public class fnzerocount {
    static int countzero(int a){
        if (a==0) {
            return 0;
        }
        int count=(a%10==0)? 1:0;
        return count+countzero(a/10);
    }
    public static void main(String[] args) {
        int a= 14580130;
        System.out.println(countzero(a));
    }
}

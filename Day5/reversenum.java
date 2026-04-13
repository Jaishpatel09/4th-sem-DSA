package Day5;

public class reversenum {
    static int reverse(int n){
        int rev=0;
       if (n==0) {
        return rev;
       }
       rev=rev*10+n%10;
       return reverse(n/10);
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(reverse(n));
    }
}

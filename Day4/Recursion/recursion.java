package Recursion;

public class recursion {
    static void printnumber(int n){
        if (n<1) {
            return;
        }
        
        System.out.println(n);
        printnumber(n-1);
    }
    public static void main(String[] args) {
        printnumber(10);
    }
}

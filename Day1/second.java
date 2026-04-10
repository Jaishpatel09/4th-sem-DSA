import java.util.Scanner;

public class second {
    public static int add( int a,int b){
        return a+b;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a;
        a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println("The sum of num is:"+sum);
}
}
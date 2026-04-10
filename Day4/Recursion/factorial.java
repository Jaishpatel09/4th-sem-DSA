package Recursion;

import java.util.Scanner;

public class factorial {
     static int fact(int n) {
        int result;

        if (n==1) 
            return 1;

        result=fact(n-1)*n;
        return result;
        
    }

public static void main(String[] args){
    System.out.print("Enter n:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fact(n));

}
}


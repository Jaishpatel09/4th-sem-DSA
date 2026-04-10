public class frequencycount {
    public static int frequency(int n, int d){
        int count=0;
        while (n>0) {
            int rem=n%10;
            if (rem==d) {
                count++;
            }
            n=n/10;
            
        }
        return count;
    }
    public static void main(String[] args) {
        int a=199;
        int b=9;

        int coun=frequency(a, b);
        System.out.println(coun);
    }
}

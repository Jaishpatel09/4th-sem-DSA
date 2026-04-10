public class multi {
    public static void main(String[] args) {
        String str1="13";
        String str2="9";

        int num1=0;
        int num2=0;

        for (int i = 0; i < str1.length(); i++) {
            num1=num1*10+(str1.charAt(i)-'0');
        }
        for (int i = 0; i < str2.length(); i++) {
            num2=num2*10+(str2.charAt(i)-'0');
        }
        System.out.println(num1 * num2);
    }
}

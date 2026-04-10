public class string {
    public static void main(String[] args) {
        String str1= new String("hello");
        String str2="Hii";

        System.out.println(str1);
        System.out.println(str2);
        
        System.out.println(str1.length()); // Total length of String

        System.out.println(str1.substring(0,2)); // to print from index 0 to index 2

        System.out.println(str1.replace('l', 'k'));


        System.out.println(str1.toUpperCase());

        System.out.println(str1.toLowerCase());

        System.out.println(str1.charAt(2));

        System.out.println(str1.equals(str2));

        System.out.println(str1.contains("World"));//if same like String its true else false

        // String rev ="";
        // for(int i=str1.length()-1;i>=0;i--)
        // {
        //     rev =rev+str1.charAt(i);
        // }
        // System.out.println(rev);
    }
}



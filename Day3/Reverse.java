public class Reverse {
    public static void main(String[] args) {
         String str1= new String("hello");
          String rev ="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            rev =rev+str1.charAt(i);
        }
        System.out.println(rev);
    }
}

public class AvgAge {
    public static void main(String[] args) {
      int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
      int sum=0;
      for (int i = 0; i < ages.length; i++) {
           sum+=ages[i];
      }
      int length=ages.length;
      float avg=sum/length;
      System.out.println("Average of the given Ages is : "+avg+" years ");

    }
}

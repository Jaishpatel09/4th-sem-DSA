public class LowestAge {
    public static void main(String[] args) {
      int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    
      int lowestage=ages[0];
      for (int i = 0; i < ages.length; i++) {
        if (lowestage>ages[i]) {
            lowestage=ages[i];
        }
    }
    System.out.println(lowestage);

    }
}

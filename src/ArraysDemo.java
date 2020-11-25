public class ArraysDemo {

  public static void main(String[] args) {

    int[] test1 = new int[4];
    test1[0] = 17;
    test1[1] = -24;
    test1[2] = 0;
    test1[3] = 8;

    boolean result = containsNumber(test1, 11);
    System.out.println("contains 11? "+result);
    result = containsNumber(test1, -24);
    System.out.println("contains -24? "+result);

    int sum = calculateSum(test1);
    System.out.println("sum: "+ sum);

  }

  public static boolean containsNumber(int[] numbers, int n) {
    //elementweise durchbewegen
    for(int e = 0;e < numbers.length;e++) {
      //prüfen ob gesuchter an jeweiliger stelle
      if(numbers[e] == n) {
        return true;
      }
    }
    return false;
  }

  public static int calculateSum(int[] numbers) {
    int sum = 0;
    //elementweise durchbewegen
    for(int e = 0;e < numbers.length;e++) {
      //summieren der einzelnen werte im array
      sum += numbers[e];
    }
    return sum;
  }



}

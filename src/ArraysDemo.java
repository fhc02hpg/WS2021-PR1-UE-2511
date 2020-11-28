import java.util.Arrays;

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

    int[] reversed = reverse(test1);
    for(int i = 0; i< reversed.length;i++) {
      System.out.print(reversed[i]+" ");
    }
    System.out.println();


    double[] test2 = {4.0,1.0,5.5,-3.75};
    double[] stats = calcStats(test2);
    System.out.println("min: "+stats[0] + ", max: "+stats[1]+ ", avg: "+stats[2]);
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

  public static int[] reverse(int[] original) {
    int[] result = new int[original.length];
    for(int i=0;i < result.length; i++) {
      result[i] = original[original.length-i-1];
    }
    return result;
  }

  public static double[] calcStats(double[] input) {

    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    double sum = 0.0;
    double[] result = new double[3]; //3 elemente fuer min, max und avg

    for(int d = 0;d < input.length; d++) {
        if(input[d] < min) {
          min = input[d];
        }
        if(input[d] > max) {
          max = input[d];
        }
        sum += input[d];
    }

    result[0] = min;
    result[1] = max;
    result[2] = sum  / input.length;

    return result;
  }

}

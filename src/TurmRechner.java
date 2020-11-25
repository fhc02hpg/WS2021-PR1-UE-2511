public class TurmRechner {

  public static void main(String[] args) {

    int number = 27;
    int counter = 2;
    int result;

    // x 2 ... x 9
    while (counter <= 9) {
      result = number * counter;
      System.out.println(number + " * "+counter+ " = " + result);
      number = result;
      counter++;
    }

    //counter == 10

    counter = 2;

    // / 2 ... / 9
    while (counter <= 9) {
      result = number / counter;
      System.out.println(number + " / "+counter+ " = " + result);
      number = result;
      counter++;
    }

  }

}

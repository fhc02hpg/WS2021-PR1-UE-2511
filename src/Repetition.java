public class Repetition {

  public static void main(String[] args) {

    //divisions

    //variant 1: integer division
    int numberA = 10;
    int numberB = 2;

    //works without considering fractions
    int resultAdivB = numberA / numberB;
    System.out.println(resultAdivB);
    int numberC = 4;
    int resultAdivC = numberA / numberC; // 10 / 4 = 2
    System.out.println(resultAdivC);

    int restAdivC = numberA % numberC; // 10 / 4 = [2] Rest -> weil 4 x 2 + 2 = 10
    System.out.println(restAdivC);

    int restADivThree = numberA % 3; // 10 % 3 = [1] Rest -> 3 x 3 + 1 = 10

    //variant 2: floating point division
    double numberD = 4.0;
    double resultAdivD = numberA / numberD; // 10 / 4.0 = 2.5
    System.out.println(resultAdivD);


    //Fallunterscheidungen

    //einfache Version
    // if () {} else {}

    if(restAdivC == 0) {
      System.out.println("es gibt keinen Rest bei division von"
          +numberA + " / "+numberC);
    } else {
      System.out.println("der rest von "
          +numberA + " / "+numberC + " ist "+restAdivC);
    }

    //mehrere Fälle unterscheiden
    double percentage = 77.10;
    String result = "";
    if(percentage >= 90.01) {
      //...
      result = "Very good!";
      //...
    } else if(percentage >= 80.01) {
      result = "Good!";
    } else if(percentage >= 70.01) {
      result = "Ok!";
    } else if(percentage >= 60.01) {
      result = "Poor!";
    } else {
      result = "Very Bad!";
    }

    System.out.println(result);

    //code Blöcke wiederholen
    //Schleifen:
    // while (...) {}
    // do {} while (...);
    // for(init; terminate; modification) {}

    int j = 100;
    while (j >= 0) {
      System.out.println(j);
      j--;
    }

    for(int i = 100; i >= 0; i--) {
      if(i * i == 49) {
        System.out.println("das ist ein schlechter wert -> überspringen!");
        continue;
      }
      System.out.println(i);
    }

    System.out.println("exiting...");

    //arrays -> reference types (not primitive types)
    //[... , ... ,... ,...]
    //fixe initiale länge
    //können nicht wachsen / schrumpfen
    //speicher mehrere elemente (vom selben datentyp)


    String[] names = new String[5];
    //arrays sind 0 indiziert -> d.h. index 0 ist das 1. element usw.
    //valid indizes = 0 .. length-1

    names[0] = "John";
    names[1] = "Jane";
    names[2] = "anonymous";
    names[3] = "Peter";
    names[4] = "Silvia";
    //names[5] = "boom!"; //results in runtime error!

    System.out.println(names[3]);
    System.out.println(names[1]);
    System.out.println(names[2]);
    names[2] = "Wilfried";
    System.out.println(names[2]);

    //arrays & Schleifen kombinieren
    //sich elementweise durch das array bewegen

    //lesen
    for(int i = 0; i < names.length; i++) {
      System.out.println(" -> "+names[i]);
    }

    //schreiben
    for(int i = 0; i < names.length; i++) {
      names[i] = "unkown";
    }

    //lesen
    for(int i = 0; i < names.length; i++) {
      System.out.println(" -> "+names[i]);
    }

  }

}

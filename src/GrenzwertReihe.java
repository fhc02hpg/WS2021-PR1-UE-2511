public class GrenzwertReihe {

  public static void main(String[] args) {

    double grenzwert1 = berechneGrenzwert(0.000001);
    System.out.println(grenzwert1);

  }

  public static double berechneGrenzwert(double genauigkeit) {

    double vwert = 0.0;
    double awert = 0.0;

    //1.0 -> 1.5 -> 1.75 -> ...
    for(int n=1;/* ? */; n *= 2) {
      awert += 1.0/n;
      if(awert - vwert < genauigkeit) {
        //System.out.println("genau genug :-)");
        break;
      }
      vwert = awert;
    }

    return awert;

  }

}

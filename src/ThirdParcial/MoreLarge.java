package ThirdParcial;

import java.util.Scanner;

public class MoreLarge {
  public static void main(String[] args) {
    String masLarga = "", mayor = "";
    Scanner U = new Scanner(System.in);
    while (true) {
      System.out.print("Palabra (o fin)?");
      String palabra = U.nextLine();
      if (palabra.equals("fin"))
        break;
      if (palabra.length() > masLarga.length()) {
        masLarga = palabra;
      }
      System.out.println(palabra.compareTo(mayor));
      if (palabra.compareTo(mayor) > 0) {
        mayor = palabra;
      }
    }
    U.close();
    System.out.println("mas larga=" + masLarga);
    System.out.println("mayor =" + mayor);
  }
}

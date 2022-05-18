package SecondParcial.Examen;

import java.util.Scanner;

public class Ejercicio5 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int numero = input("Ingrese el numero");
    String serie = "";
    for (int i = 0; i < numero; i++) {
      boolean res = primos(i);
      if (res)
        serie += "" + i + " ";
    }
    print(serie);
  }

  public static boolean primos(int num) {
    boolean isPrime = true;
    if (num < 2)
      return false;
    for (int x = 2; x * x <= num; x++) {
      if (num % x == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }

  public static int input(String message) {
    System.out.println(message);
    return sc.nextInt();
  }

  public static void print(String message) {
    System.out.println(message);
  }
}

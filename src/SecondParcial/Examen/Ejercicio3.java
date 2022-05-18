package SecondParcial.Examen;

import java.util.Scanner;

public class Ejercicio3 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int numero = (input("Ingrese el numero"));
    if (numero < 0) {
      print("El numero no es positivo");
    } else {
      int res = cifres(numero);
      print("El numero tiene " + res + " cifras");
    }
  }

  public static int cifres(int numero) {
    String numeroStr = String.valueOf(numero);
    return numeroStr.length();
  }

  public static int input(String message) {
    System.out.println(message);
    return sc.nextInt();
  }

  public static void print(String message) {
    System.out.println(message);
  }
}

package ThirdParcial.Examen;

import java.util.Scanner;

public class Ejercicio3 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String cadena = input("Ingrese una cadena: ");
    String reverse = "";
    for (int i = cadena.length() - 1; i >= 0; i--) {
      reverse += cadena.charAt(i);
    }
    print(reverse);
  }
  public static void print(String message) {
    System.out.println(message);
  }
  public static String input(String message) {
    System.out.print(message);
    return sc.nextLine();
  }
}

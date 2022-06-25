package ThirdParcial.Examen;

import java.util.Scanner;

public class Ejercicio1 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    char caracter = input("Caracter a buscar: ").charAt(0);
    String cadena = input("Ingrese una cadena: ");
    int results = 0;
    for (int i = 0; i < cadena.length(); i++) {
      char charAt = cadena.charAt(i);
      if (charAt == caracter) results++;
    }
    print("El caracter: " + caracter + " se repite " + results + " veces");
  }
  public static void print(String message) {
    System.out.println(message);
  }
  public static String input(String message) {
    System.out.print(message);
    return sc.nextLine();
  }
}

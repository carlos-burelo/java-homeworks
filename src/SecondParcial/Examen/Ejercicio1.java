package SecondParcial.Examen;

import java.util.Scanner;

public class Ejercicio1 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int numero1 = input("Ingrese el primer numero");
    int numero2 = input("Ingrese el segundo numero");
    String rango = "";
    if (numero1 == numero2) {
      print("Los numeros no pueden ser iguales");
      numero1 = input("Ingrese el primer numero");
      numero2 = input("Ingrese el segundo numero");
    }
    for (int i = numero1; i <= numero2; i++) {
      rango += "" + i + "\s";
    }
    print(rango);
  }

  public static int input(String message) {
    System.out.println(message);
    return sc.nextInt();
  }

  public static void print(String message) {
    System.out.println(message);
  }
}

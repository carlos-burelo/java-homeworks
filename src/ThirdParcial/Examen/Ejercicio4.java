package ThirdParcial.Examen;

import java.util.Scanner;

public class Ejercicio4 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int tamaño = input("tamaño: ");
    int[] array = new int[tamaño];
    String output = "";
    for (int i = 0; i < array.length; i++) {
      array[i] = input("Ingrese un numero: ");
      for (int j = 0; j < array[i]; j++) {
        output += "*";
      }
      output += "\n";
    }
    print(output);

  }
  public static void print(String message) {
    System.out.println(message);
  }
  public static int input(String message) {
    System.out.print(message);
    return sc.nextInt();
  }
}

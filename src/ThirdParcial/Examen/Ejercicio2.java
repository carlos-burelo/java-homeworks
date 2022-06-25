package ThirdParcial.Examen;

import java.util.Scanner;

public class Ejercicio2 {
  public static Scanner sc = new Scanner(System.in);
  public static int[][] matriz1 = new int[3][3];
  public static int[][] matriz2 = new int[3][3];
  public static int[][] resultado = new int[3][3];

  public static void main(String[] args) {
    String salida = "";
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        print("Ingrese un numero: ");
        matriz1[i][j] = sc.nextInt();
        resultado[i][j] += matriz1[i][j];
        salida += matriz1[i][j];
      }
      salida += "\n";
    }
    salida += "\n";
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        print("Ingrese un numero: ");
        matriz2[i][j] = sc.nextInt();
        resultado[i][j] += matriz2[i][j];
        salida += matriz2[i][j];
      }
      salida += "\n";
    }
    salida += "\n\n";
    salida += "\nMatriz sumada\n";
    for (int index = 0; index < 3; index++) {
      for (int i = 0; i < 3; i++) {
        salida += resultado[index][i];
      }
      salida += "\n";
    }
    salida += "\nMatriz trasnpuesta\n";
    for (int i = 0; i < 3; i++) {
      salida += matriz1[i][i];
      salida += "\n";
    }
    print(salida);
  }
  public static void print(String message) {
    System.out.print(message);
  }
  public static String input(String message) {
    System.out.print(message);
    return sc.nextLine();
  }
}

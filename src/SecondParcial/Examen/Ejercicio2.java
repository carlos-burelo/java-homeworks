package SecondParcial.Examen;

import java.util.Scanner;

public class Ejercicio2 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int aprobados = 0, reprobados = 0;
    double nota = input("Ingrese la nota del alumno");
    do {
      if (nota >= 7)
        aprobados++;
      else
        reprobados++;
      nota = input("Ingrese la nota del alumno");
    } while (nota > 0);
    print("El numero de reprobados fue de " + reprobados);
    print("El numero de aprobados fue de " + aprobados);
  }

  public static int input(String message) {
    System.out.println(message);
    return sc.nextInt();
  }

  public static void print(String message) {
    System.out.println(message);
  }
}

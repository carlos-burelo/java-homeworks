package SecondParcial.Examen;

import java.util.Scanner;

public class Ejercicio4 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    print("Ingrese la clase del trabajador");
    String clase = sc.nextLine();
    String claseLower = clase.toLowerCase();
    int horas = input("Ingrese las horas trabajadas");
    if (claseLower.equals("a")) {
      print("El sueldo es de $" + horas * 25);
    }
    if (claseLower.equals("b")) {
      print("El sueldo es de $" + horas * 20);
    }
    if (claseLower.equals("c")) {
      print("El sueldo es de $" + horas * 15);
    }
    if (claseLower.equals("d")) {
      print("El sueldo es de $" + horas * 10);
    }
  }

  public static int input(String message) {
    System.out.println(message);
    return sc.nextInt();
  }

  public static void print(String message) {
    System.out.println(message);
  }
}

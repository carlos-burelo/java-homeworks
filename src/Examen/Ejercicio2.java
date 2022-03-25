package Examen;

import javax.swing.JOptionPane;

public class Ejercicio2 {
  public static void main(String[] args) {
    int numero1 = Integer.parseInt(input("Ingrese e primer numero"));
    int numero2 = Integer.parseInt(input("Ingrese e segundo numero"));
    if (numero2 == 0) {
      print("El divisor no puede ser 0");
    } else {
      print("El resultado de la operacion es: " + numero1 / numero2);
    }
  }

  public static String input(String message) {
    return JOptionPane.showInputDialog(null, message);
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

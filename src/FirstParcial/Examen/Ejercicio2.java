package FirstParcial.Examen;

import javax.swing.JOptionPane;

public class Ejercicio2 {
  public static void main(String[] args) {
    int numero1 = input("Ingrese el primer numero");
    int numero2 = input("Ingrese el segundo numero");
    if (numero1 == 0) {
      print("El divisor no puede ser 0");
    } else {
      print("El resultado de la operacion es: " + numero1 / numero2);
    }
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

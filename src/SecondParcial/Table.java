package SecondParcial;

import javax.swing.JOptionPane;

public class Table {
  public static void main(String[] args) {
    int numero1 = input("Ingrese el primer numero");
    int numero2 = input("Ingrese el segundo numero");
    print(numero1 + " + " + numero2 + " = " + suma(numero1, numero2));
    print(numero1 + " - " + numero2 + " = " + resta(numero1, numero2));
    print(numero1 + " * " + numero2 + " = " + multiplicacion(numero1, numero2));
    print(numero1 + " / " + numero2 + " = " + division(numero1, numero2));
  }

  public static int suma(int numero1, int numero2) {
    return numero1 + numero2;
  }

  public static int resta(int numero1, int numero2) {
    return numero1 - numero2;
  }

  public static int multiplicacion(int numero1, int numero2) {
    return numero1 * numero2;
  }

  public static int division(int numero1, int numero2) {
    return numero1 / numero2;
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

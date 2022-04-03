package SecondParcial;

import javax.swing.JOptionPane;

public class ForFactorial {
  public static void main(String[] args) {
    int factorial = 1;
    int numero = input("Ingrese un numero");
    for (int i = 1; i < numero; numero--) {
      factorial *= numero;
    }
    print("El factorial es: " + factorial);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

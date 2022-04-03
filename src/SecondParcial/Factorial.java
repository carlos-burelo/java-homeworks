package SecondParcial;

import javax.swing.JOptionPane;

public class Factorial {
  public static void main(String[] args) {
    int factorial = 1;
    int numero = 6;
    do {
      factorial *= numero;
      numero--;
    } while (numero != 0);
    print("" + factorial);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

package SecondParcial;

import javax.swing.JOptionPane;

public class WhileSum {
  public static void main(String[] args) {
    int suma = 1;
    int numero = input("Ingrese un numero");
    do {
      suma += numero;
      numero--;
    } while (1 < numero);
    print("La suma total es: " + suma);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

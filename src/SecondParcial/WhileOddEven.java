package SecondParcial;

import javax.swing.JOptionPane;

public class WhileOddEven {
  public static void main(String[] args) {

    int base = 0, numero = input("Ingrese un numero");
    String message = "Los numero son:\n\n";
    while (base <= numero) {
      boolean isOdd = base % 2 != 0;
      if (isOdd)
        message += "" + base + "\n";
      base++;
    }
    print(message);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

package SecondParcial;

import javax.swing.JOptionPane;

// 10
public class WhileTwoNumbers {
  public static void main(String[] args) {
    int counter = 0;
    int number = input("Ingrese un numero");
    while (number >= 0) {
      if (number % 10 == 2) {
        counter++;
      }
      number = input("Ingrese un nuevo numero");
    }
    print("Se ingresaron " + counter + " que acaban en 2");

  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

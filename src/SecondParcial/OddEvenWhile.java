package SecondParcial;

import javax.swing.JOptionPane;

public class OddEvenWhile {
  public static void main(String[] args) {
    int numero = input("Ingrese un numero");
    do {
      if (numero % 2 == 0) {
        print("El numero es par\n");
      } else {
        print("El numero es impar");
      }
      if (numero >= 0) {
        print("El numero es positivo");
      } else {
        print("El numero es negativo");
      }
      break;
    } while (numero != 0);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

package SecondParcial;

import javax.swing.JOptionPane;

public class NumbersPrimes {
  public static void main(String[] args) {
    int numero = input("Ingrese un numero");
    boolean isPrime = primos(numero);
    String message = "El numero " + numero + (isPrime ? " es" : " no es") + " primo";
    print(message);
  }

  public static boolean primos(int num) {
    boolean isPrime = true;
    if (num < 2)
      return false;
    for (int x = 2; x * x <= num; x++) {
      if (num % x == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

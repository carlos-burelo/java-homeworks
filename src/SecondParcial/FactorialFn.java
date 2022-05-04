package SecondParcial;

import javax.swing.JOptionPane;

public class FactorialFn {
  public static void main(String[] args) {
    int numero = input();
    System.out.println(factorial(numero));
    System.out.println(suma(numero));
  }

  public static int factorial(int numero) {
    int factorial = 1;
    for (int i = 1; i <= numero; i++) {
      factorial *= i;
    }
    return factorial;
  }

  private static int suma(int numero) {
    int suma = 0;
    for (int i = 0; i <= numero; i++) {
      suma += i;
    }
    return suma;
  }

  public static int input() {
    return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
  }

}

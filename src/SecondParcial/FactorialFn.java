package SecondParcial;

import javax.swing.JOptionPane;

public class FactorialFn {
  public static void main(String[] args) {
    int numero = Integer.parseInt(
        JOptionPane.showInputDialog(null, "Ingrese un numero"));
    // int resultado =;
    System.out.println(factorial(numero));
    System.out.println(suma(numero));
    // int sumaRes

  }

  public static int factorial(int numero) {
    int factorial = 1;
    for (int i = 1; i <= numero; i++) {
      factorial *= i;
    }
    return factorial;
  }

  public static int suma(int numero) {
    int suma = 0;
    for (int i = 0; i <= numero; i++) {
      suma += i;
    }
    return suma;
  }
}

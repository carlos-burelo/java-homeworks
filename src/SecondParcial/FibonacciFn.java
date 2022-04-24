package SecondParcial;

import javax.swing.JOptionPane;

public class FibonacciFn {
  public static void main(String[] args) {
    int numero = input();
    System.out.println(fibo(numero));
  }

  public static int input() {
    return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
  }

  public static String fibo(int limite) {
    int numero1 = 0;
    int numero2 = 1;
    String serie = "Los primeros " + limite + " numeros de la serie de fibonacci son: ";
    for (int i = 0; i < limite; i++) {
      serie += numero1 + " ";
      int suma = numero1 + numero2;
      numero1 = numero2;
      numero2 = suma;
    }
    return serie;
  }
}

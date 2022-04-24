package SecondParcial;

import javax.swing.JOptionPane;

class Fibonacci {
  public static void main(String[] args) {
    int numero = input();
    // el numero sera el limite para obtener los primeros numero de la serie
    int numero1 = 0;
    int numero2 = 1;
    for (int i = 0; i < numero; i++) {
      System.out.print(numero1 + " ");
      int suma = numero1 + numero2;
      numero1 = numero2;
      numero2 = suma;
    }

  }

  public static int input() {
    return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
  }
}
package SecondParcial;

import javax.swing.JOptionPane;

public class DoWhileNumbers {
  public static void main(String[] args) {
    String numero = input("Ingrese un numero");
    int numeroInt = Integer.parseInt(numero);
    int count = 0;
    if (numeroInt < 0 || numeroInt > 999) {
      print("El numero est fuera de rango");
    } else {
      do {
        count++;
      } while (count < numero.length());
      print("El numero tiene " + count + " cifras");
    }
  }

  public static String input(String message) {
    return JOptionPane.showInputDialog(null, message);
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

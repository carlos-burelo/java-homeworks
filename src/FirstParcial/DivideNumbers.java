package FirstParcial;

import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class DivideNumbers {
  public static void main(String[] args) {
    String num = JOptionPane.showInputDialog(null, "Ingrese el primer numero");
    int numInt = Integer.parseInt(num);
    if (numInt > 0 && numInt < 99999) {
      String message = "El numero tiene " + num.length() + " cifras\n";
      print(message);
    } else {
      print("El numero esta fuera de rango (0-9999)");
    }
  }

  public static void print(String msg) {
    JOptionPane.showMessageDialog(null, msg);
  }
}
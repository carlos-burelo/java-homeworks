package FirstParcial;
/**
  Realizar un programa en java que lea un numero entero de 5
  cifras y que muestre cada una de las cifras que componen el numero
  @example
  1
  1 2
  1 2 3
  1 2 3 4
  1 2 3 4 5
  */

import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class FiveCifres {
  public static void main(String[] args) {
    String number = JOptionPane.showInputDialog(null, "INGRESE EL NUMERO");
    String message = "Los numeros son:\n";
    for (int count = 1; count <= 5; ++count) {
      message += number.substring(0, count) + '\n';
      message += number.substring(0, count) + '\n';
      message += number.substring(0, count) + '\n';
      message += number.substring(0, count) + '\n';
      message += number.substring(0, count) + '\n';
      message += number.substring(0, count) + '\n';
      message += number.substring(0, count) + '\n';
      message += number.substring(0, count) + '\n';
    }
    JOptionPane.showMessageDialog(null, message);
  }
}

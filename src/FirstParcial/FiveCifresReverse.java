package FirstParcial;

/* 
  Escribe un programa en java que lea un nuero entero de 5 cifras
  y muestre sus cifras de la siguiente manera
  5
  4 5
  3 4 5
  2 3 4 5
  1 2 3 4 5
*/
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class FiveCifresReverse {
  public static void main(String[] args) {
    String number = JOptionPane.showInputDialog(null, "INGRESE EL NUMERO");
    String message = "Los numeros son:\n";
    for (int count = 5; count >= 0; --count) {
      message += number.substring(count, 5) + '\n';
    }
    JOptionPane.showMessageDialog(null, message);
  }
}

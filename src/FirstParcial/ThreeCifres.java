package FirstParcial;

/** 
  Lo mismo de arriba,que lea un entero de 3 cifras y muestre por
  separado las cifras del numero
 */
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class ThreeCifres {
  public static void main(String[] args) {
    String number = JOptionPane.showInputDialog(null, "INGRESE EL NUMERO");
    JOptionPane.showMessageDialog(null, "" + number.charAt(0) + '\n' + number.charAt(1) + '\n' + number.charAt(2));
  }
}

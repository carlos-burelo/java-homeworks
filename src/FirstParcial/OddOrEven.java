package FirstParcial;

/**
  Realizar un programa en java que lea un numero entero y muestre
  si es par o impar.
 */
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class OddOrEven {
  public static void main(String[] args) {
    int number = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO"));
    if (number % 2 != 0)
      print(number, "impar");
    else
      print(number, "par");
  }

  static void print(int number, String type) {
    JOptionPane.showMessageDialog(null, "El numero " + number + " es " + type);
  }
}

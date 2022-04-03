package FirstParcial;

/**
  Realizar un programa quen java que lea un numero y compruebe
  si el numero es mayor o igual a 18 y muestre un mensaje.
  */
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class IsOlder {
  public static void main(String[] args) {
    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
    if (edad >= 18) {
      JOptionPane.showMessageDialog(null, "Es mayor de edad y puede votar");
    } else {
      JOptionPane.showMessageDialog(null, "Es menor de edad y no puede votar");
    }
  }
}

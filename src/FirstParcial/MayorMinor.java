package FirstParcial;

/**
 Realizar un programa que reciba 3 numeros enteros y muestre
 en orden de mayor a menor.
*/
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class MayorMinor {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
    int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero"));
    if (num1 < num2 && num1 < num3) {
      if (num2 < num3)
        print(num1 + " " + num2 + " " + num3);
      else
        print(num1 + " " + num3 + " " + num2);
    } else if (num2 < num1 && num2 < num3) {
      if (num1 < num3)
        print(num2 + " " + num1 + " " + num3);
      else
        print(num2 + " " + num3 + " " + num1);
    } else if (num3 < num1 && num3 < num2) {
      if (num1 < num2)
        print(num3 + " " + num1 + " " + num2);
      else
        print(num3 + " " + num2 + " " + num1);
    }
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

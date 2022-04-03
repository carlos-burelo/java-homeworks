package FirstParcial;

/**
 Realizar un programa en java que reciba 2 numeros y 
 realize una operacion dependiendo de la opcion elegida. 
 */

import javax.swing.JOptionPane;

/**
 * @author: Carlos Burelo
 */
public class MenuOperations {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
    int option = Integer.parseInt(
        JOptionPane.showInputDialog(null, "Opereraciones\n\n1. Resta\n2. Suma\n3.Multiplicacion\n4. Division"));
    String message = "El resultado de la operacion es: ";
    switch (option) {
      case 1:
        message += "" + (num1 - num2);
        break;
      case 2:
        message += "" + (num1 + num2);
        break;
      case 3:
        message += "" + (num1 * num2);
        break;
      case 4:
        message += "" + (num1 / num2);
        break;
      default:
        message = "La opcion no existe";
    }
    JOptionPane.showMessageDialog(null, message);
  }
}

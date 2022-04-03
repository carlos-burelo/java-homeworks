package FirstParcial;

/**
  hacer un programa que pida un numerod del 1 al 7
  y dependeiendo el numero muestre el dia de la semana que corresponde;
 */
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class SwitchExample {
  public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del dia de la semana"));
    String message = "El dia de la semana es: ";
    switch (num) {
      case 1:
        message += "Lunes";
        break;
      case 2:
        message += "Martes";
        break;
      case 3:
        message += "Miercoles";
        break;
      case 4:
        message += "Jueves";
        break;
      case 5:
        message += "Viernes";
        break;
      case 6:
        message += "Sabado";
        break;
      case 7:
        message += "Domingo";
        break;
      default:
        message = "El numero de semana ingresado no existe";
    }
    JOptionPane.showMessageDialog(null, message);
  }
}

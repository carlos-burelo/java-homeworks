package FirstParcial;

/**
  Realizar un programa en java que reciba 2 numeros y 
  obtener el salario por hora de un trabajador.
 */
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class Salary {
  public static void main(String[] args) {
    int Salary = Integer.parseInt(
        JOptionPane.showInputDialog("Ingrese el salario por hora"));
    int Hours = Integer.parseInt(
        JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
    int SalaryWeek = Salary * Hours;
    String message = "El salario semanal es: " + SalaryWeek + '\n' +
        "El salario por hora es: " + Salary;
    JOptionPane.showMessageDialog(null, message);
  }
}
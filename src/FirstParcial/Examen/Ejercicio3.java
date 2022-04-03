package FirstParcial.Examen;

import javax.swing.JOptionPane;

public class Ejercicio3 {
  public static void main(String[] args) {
    int hours = input("Ingrese una hora");
    int minutes = input("Ingrese los minutos");
    int seconds = input("Ingrese los segundos");
    if (hours > 23 || hours < 1) {
      print("El formato de hora no es valida");
    } else if (minutes < 0 || minutes > 59)
      print("El formato de minutos no es valido");
    else if (seconds < 0 || seconds > 59)
      print("El formato de los segundos no es valido");
    else {
      print("La hora ingresada fue:  " + hours + ":" + minutes + ":" + seconds);
    }
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

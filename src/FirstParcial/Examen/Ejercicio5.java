package FirstParcial.Examen;

import javax.swing.JOptionPane;

public record Ejercicio5() {
  public static void main(String[] args) {
    int parcial1 = input("Ingrese la calificacion del primer parcial");
    int parcial2 = input("Ingrese la calificacion del segundo parcial");
    int parcial3 = input("Ingrese la calificacion del tercer parcial");
    int promedio = (parcial1 + parcial2 + parcial3) / 3;
    if (promedio <= 5)
      print("El alumno ha reprobado con: " + promedio);
    else
      print("El alumno ha aprobado: " + promedio);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

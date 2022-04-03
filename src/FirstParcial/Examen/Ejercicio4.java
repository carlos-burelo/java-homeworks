package FirstParcial.Examen;

import javax.swing.JOptionPane;

public class Ejercicio4 {
  public static void main(String[] args) {
    int mes = input("Ingrese el numero del mes");
    if (mes >= 1 && mes <= 12) {
      switch (mes) {
        case 1:
          print("Mes: Enero\nDias: 31");
          break;
        case 2:
          print("Mes: Febrero\nDias: 28");
          break;
        case 3:
          print("Mes: Marzo\nDias: 31");
          break;
        case 4:
          print("Mes: Abril\nDias: 30");
          break;
        case 5:
          print("Mes: Mayo\nDias: 31");
          break;
        case 6:
          print("Mes: Junio\nDias: 30");
          break;
        case 7:
          print("Mes: Julio\nDias: 31");
          break;
        case 8:
          print("Mes: Agosto\nDias: 31");
          break;
        case 9:
          print("Mes: Septiembre\nDias: 30");
          break;
        case 10:
          print("Mes: Octubre\nDias: 31");
          break;
        case 11:
          print("Mes: Noviembre\nDias: 30");
          break;
        case 12:
          print("Mes: Diciembre\nDias: 31");
          break;
      }
    } else {
      print("El numero: " + mes + " no es un mes valido");
    }
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

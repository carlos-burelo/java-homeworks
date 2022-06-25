package ThirdParcial;

import javax.swing.JOptionPane;

public class SumMartrices {
  public static void main(String[] args) {
    for (int f = 0; f < 2; f++) {
      int filas = input("Ingrese el numero de filas para la matriz " + f + 1);
      int columnas = input("Ingrese el numero de columnas para la matriz " + f + 1);
      int[][] matriz = new int[filas][columnas];
      for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
          matriz[i][j] = input("Ingrese un numero para la matriz " + f + 1 + " (" + i + "," + j + ")");
          // sumar con sus mismas posiciones
        }
      }
    }
  }
  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }
}

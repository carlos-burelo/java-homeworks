package ThirdParcial;

import javax.swing.JOptionPane;

// import javax.swing.JOptionPane;

public class Diagonal {
  public static void main(String[] args) {
    int[][] matriz = new int[3][3];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
      }
    }
    for (int i = 0; i < matriz.length; i++) {

    }
  }
}
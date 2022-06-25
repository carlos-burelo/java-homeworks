package ThirdParcial;

import javax.swing.JOptionPane;

public class Promedio {
  public static void main(String[] args) {
    double[] notas = new double[7];
    int count = 0;
    for (int i = 0; i < notas.length; i++) {
      double nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
      notas[i] = nota;
      count += nota;
    }
    System.out.println("El promedio es: " + count / 7);
  }
}

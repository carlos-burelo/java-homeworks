package ThirdParcial;

import javax.swing.JOptionPane;

public class OddEvenMiddle {
  public static void main(String[] args) {
    double[] notas = new double[10];
    double count = 0;
    for (int i = 0; i < notas.length; i++) {
      double numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
      notas[i] = numero;
      if (i % 2 == 0) count += numero;
    }
    double media = count / 10;
    JOptionPane.showMessageDialog(null, "La media es de : " + media + "\n ");
  }
}

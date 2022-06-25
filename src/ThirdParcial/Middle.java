package ThirdParcial;

import javax.swing.JOptionPane;

public class Middle {
  public static void main(String[] args) {
    int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Numero de alumnos"));
    double[] notas = new double[alumnos];
    double count = 0;
    for (int i = 0; i < notas.length; i++) {
      double nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
      notas[i] = nota;
      count += nota;
    }
    // notas.
    double media = count / alumnos;
    int porEncima = 0;
    for (int i = 0; i < notas.length; i++) {
      if (notas[i] > media) porEncima++;
    }
    JOptionPane.showMessageDialog(null, "La media es de : " + media + "\nAlumnos por encima de la media: " + porEncima);
  }
}

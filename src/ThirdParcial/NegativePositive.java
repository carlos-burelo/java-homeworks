package ThirdParcial;

import javax.swing.JOptionPane;

public class NegativePositive {
  public static void main(String[] args) {
    int[] numeros = new int[10];
    String message = "";
    int positivos = 0, negativos = 0, ceros = 0;
    for (int i = 0; i < numeros.length; i++) {
      int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
      message += " " + numero;
      numeros[i] = numero;
      if (numero == 0) ceros++;
      if (numero > 0) positivos++;
      else negativos++;
    }
    JOptionPane.showMessageDialog(null, "Numeros: " + message + "\nNegativos: " + negativos + "\nCeros: " + ceros +
        "\nPositivos: " + positivos);
  }
}

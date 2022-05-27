package ThirdParcial;

import javax.swing.JOptionPane;

public class StringLength {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog(null, "Ingrese una frase");
    JOptionPane.showMessageDialog(null, "La longitud de la frase es: " + input.length());
  }
}

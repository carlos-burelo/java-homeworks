package ThirdParcial;

import javax.swing.JOptionPane;

public class StringInverted {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog(null, "Ingrese una frase");
    String output = "";
    // invertir palabras
    String[] words = input.split(" ");
    for (int i = words.length - 1; i >= 0; i--) {
      output += words[i] + " ";
    }
    System.out.println(output);
  }
}

package ThirdParcial;

import javax.swing.JOptionPane;

public class OmitedChar {
  public static void main(String[] args) {
    char[] abc = new char[26];
    for (int i = 0; i < 26; i++)
      abc[i] = (char) ('a' + i);
    String cadena = JOptionPane.showInputDialog("Ingrese una cadena de caracteres");
    for (int i = 0; i < cadena.length(); i++) {
      if (cadena.charAt(i) != ' ') {
        abc[cadena.charAt(i) - 'a'] = ' ';
      }
    }
    System.out.println(abc);
  }
}

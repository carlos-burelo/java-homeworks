package SecondParcial;

import javax.swing.JOptionPane;

public class MutiplicationTable {
  public static void main(String[] args) {
    int num = input("Ingrese un numero");
    String message = "La tabla del #" + num;
    for (int i = 0; i <= 10; i++) {
      message += "" + num + "x" + i + "=" + (num * i) + "\n";
    }
    print(message);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

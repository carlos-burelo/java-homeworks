package SecondParcial;

import javax.swing.JOptionPane;

// realizar un programa que pida un numero 
// y genere la suma de todos esos numeros numeros
public class While {
  public static void main(String[] args) {
    int count = 0, base = 0, num = input("Ingrewse un numero");
    String msg = "";
    String msg2 = "";
    while (count <= num) {
      base += count;
      count++;
      msg2 += "" + count + " la suma es" + base + "\n";
      msg = "" + base;
    }

    print(msg2 + "\n" + msg);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

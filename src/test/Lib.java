package test;

import javax.swing.JOptionPane;

public class Lib {
  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void show(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public static void main(String[] args) {
    int num1 = input("Ingrese el numero del mes");
  }
}

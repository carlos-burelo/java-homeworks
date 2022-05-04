package SecondParcial;

import javax.swing.JOptionPane;

// programa que pida un numero y lo convierta a su representacion binaria
// octal y hexadecimal
public class BinaryFn {
  public static void main(String[] args) {
    int numero = input("Ingrese un numero");
    print("El numero en binario es: " + binary(numero));
    print("El numero en octal es: " + octal(numero));
    print("El numero en hexadecimal es: " + hexadecimal(numero));
  }

  // Conversion a los diferentes sistemas utilizando la clase Integer
  public static String binary(int num) {
    return Integer.toBinaryString(num);
  }

  public static String octal(int num) {
    return Integer.toOctalString(num);
  }

  public static String hexadecimal(int num) {
    return Integer.toHexString(num);
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

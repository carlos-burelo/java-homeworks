package Examen;

import javax.swing.JOptionPane;

public class Ejercicio1 {
  public static void main(String[] args) {
    int precio = Integer.parseInt(input("Ingrese el precio del producto"));
    int iva = Integer.parseInt(input("Importe del iva a aplicar"));
    int cantidad = Integer.parseInt(input("Cantidad de productos vendidos"));
    int subtotal = precio * cantidad;
    print("El total fue:" + (subtotal * iva / 100 + subtotal));
  }

  public static String input(String message) {
    return JOptionPane.showInputDialog(null, message);
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

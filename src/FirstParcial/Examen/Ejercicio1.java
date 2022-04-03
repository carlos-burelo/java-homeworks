package FirstParcial.Examen;

import javax.swing.JOptionPane;

public class Ejercicio1 {
  public static void main(String[] args) {
    int precio = input("Ingrese el precio del producto");
    int iva = input("Importe del iva a aplicar");
    int cantidad = input("Cantidad de productos vendidos");
    int subtotal = precio * cantidad;
    print("El total fue:" + (subtotal * iva / 100 + subtotal));
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

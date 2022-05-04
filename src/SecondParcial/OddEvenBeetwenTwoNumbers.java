package SecondParcial;

import javax.swing.JOptionPane;

public class OddEvenBeetwenTwoNumbers {
  public static void main(String[] args) {
    int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
    int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
    if (numero2 <= numero1) {
      System.out.println("Los numeros ingresados no son validos");
    } else {
      // int contador = 0;
      String message = "";
      for (int i = numero1; i < numero2; i++) {
        if (i % 2 == 0) {
          // contador++;
          message += i + " ";
        }
      }
      JOptionPane.showMessageDialog(null, message);
    }
  }
}

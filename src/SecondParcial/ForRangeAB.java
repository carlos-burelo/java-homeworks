package SecondParcial;

import javax.swing.JOptionPane;

public class ForRangeAB {
  public static void main(String[] args) {
    int numA = input("Ingrese un numero A");
    int numB = input("Ingrese un numero B");
    String message = "Los numeros pares entre " + numA + " y " + numB + " son:";
    while (numA > numB) {
      print("El numero A no puede ser mayor a B");
      numA = input("Ingrese un numero A");
      numB = input("Ingrese un numero B");
    }
    for (int i = numA; i < numB; i++) {
      if (i % 2 == 0)
        message += "\n" + i;
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

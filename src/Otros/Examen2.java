package Otros;

import javax.swing.JOptionPane;

public class Examen2 {
  public static int[] arreglo = new int[5];
  public static void main(String[] args) {
    int opcion = menu();
    while (opcion != 3) {
      switch (opcion) {
        case 1: { opcion1(); break; }
        case 2: { opcion2(); break; }
      }
      opcion = menu();
    }
  }
  public static int menu() {
    String menu = "1) Numero perfecto\n2) Sumar matriz 2\n3) Salir";
    return Integer.parseInt(JOptionPane.showInputDialog(null,menu));
  }


  public static void imprimirEnPantalla(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
  public static int obtenerValor(String message) {
    String number = JOptionPane.showInputDialog(null, message);
    return Integer.parseInt(number);
  }
  public static void opcion1() {
    int numero = obtenerValor("Ingrese un numero");
    int nump = 0;
    for (int i = 1; i < numero; i++) {
      if (numero % i == 0) nump += i;
    }
    String mensaje = "";
    if (nump == numero) {
      mensaje =  numero + "-  Es un numero perfecto" + 
    "\nSu valor es: " + nump;
    } else {
      mensaje = "El numero" + numero + " no es un numero perfecto";
    }
    imprimirEnPantalla(mensaje);
    String siONo = JOptionPane.showInputDialog(null, "Desea volver al menu?(si/no)");
    if (siONo.toLowerCase().equals("si")) {
      return;
    } else {
      System.exit(0);
    }
  }
  public static void opcion2() {
    int i = 0;
    while (i < arreglo.length) {
      arreglo[i] = obtenerValor("Ingrese un numero");
      i++;
    }
    int sum = 0;
    int j = 0;
    while (j < arreglo.length) {
      sum += arreglo[j];
      j++;
    }
    String message = "";
    for (int k = 0; k < arreglo.length; k++) {
      message += arreglo[k] + " ";
    }
    message += "\nLa suma de los valores es: " + sum;
    imprimirEnPantalla(message);
    String siONo = JOptionPane.showInputDialog(null, "Desea volver al menu?(si/no)");
    if (siONo.toLowerCase().equals("si")) {
      return;
    } else {
      System.exit(0);
    }
  }
}

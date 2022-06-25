package Otros;
import javax.swing.JOptionPane;

public class Examen {
  // GLOBAL VARIABLES
  public static int[] arreglo = new int[5];
  public static void main(String[] args) {
    int option = showMenu();
    while(option != 3){
      if (option == 1) numeroPerfecto();
      if (option == 2) sumaMatriz();
      option = showMenu();
    }
  }
  public static int showMenu() {
    String title = "Menu title";
    String menu = 
      "1. Calcular numero perfecto\n" +
      "2. Sumar matrices\n" +
      "3. Salir\n";
    return getOption(menu, title);
  }
  // METHODS FOR ACTIONS
  public static void sumaMatriz() {
    // ingresa valores al arreglo
    for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = getValue("Ingrese un numero");
    }
    // y los suma
    int sum = 0;
    for (int i = 0; i < arreglo.length; i++) {
      sum += arreglo[i];
    }
    // imprime los valores del arreglo
    String message = "";
    for (int i = 0; i < arreglo.length; i++) {
      message += arreglo[i] + " ";
    }
    // imprime el resultado
    message += "\nLa suma de los valores es: " + sum;
    // pregunta si quiere volver al menu sino termina el programa
    print(message);
    String salir = JOptionPane.showInputDialog(null, "Quiere volver al menu?(si ó no)");
    if (salir.toLowerCase().equals("si")) {
      return;
    } else {
      System.exit(0);
    }
  }
  public static void numeroPerfecto() {
    int numero = getValue("Ingrese un numero");
    // calcula el numero perfecto de dicho numero
    int numeroPerfecto = 0;
    for (int i = 1; i < numero; i++) {
      if (numero % i == 0) numeroPerfecto += i;
    }
    String mensaje = "";
    if (numeroPerfecto == numero) {
      mensaje = "El numero " + numero + " es un numero perfecto y su valor es: " + numeroPerfecto;
    }
    else {
      mensaje = "El numero" + numero + " no es un numero perfecto";
    }
    print(mensaje);
    String salir = JOptionPane.showInputDialog(null, "Quiere volver al menu?(si ó no)");
    if (salir.toLowerCase().equals("si")) {
      return;
    } else {
      System.exit(0);
    }
  }
  // PUBLIC METHODS
  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
  public static int getOption(String message, String title) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message, title,3));
  }
  public static int getValue(String message) {
    String input = JOptionPane.showInputDialog(null, message);
    int number = Integer.parseInt(input);
    return number;
  }
}

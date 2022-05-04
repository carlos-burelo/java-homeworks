package SecondParcial;

import java.util.Random;

import javax.swing.JOptionPane;

public class Functions {
  public static void main(String[] args) {
    print("Hola mundo");
    int resultadoSuma = suma(10, 30);
    print("El resultado de la suma es: " + resultadoSuma);
    boolean esMayor = numeroMayor(1);
    print(esMayor ? "El numero 1 es mayor a 0" : "Esto es relativamente imposible");
    int codigoAscii = codigoASCII('a');
    print("El codigo ascii de \"a\" es: " + codigoAscii);
    int random = randomValue(1, 10);
    print("Un valor random entre 1 y 10 es: " + random);
  }

  public static int suma(int numero1, int numero2) {
    return numero1 + numero2;
  }

  public static int randomValue(int num1, int num2) {
    Random ramdom = new Random();
    return ramdom.nextInt(num2 - num1) + num1;
  }

  public static boolean numeroMayor(int num1) {
    return num1 > 0;
  }

  public static int codigoASCII(char character) {
    return (int) character;
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

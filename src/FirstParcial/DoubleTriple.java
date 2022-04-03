package FirstParcial;

/**
  realizar un programa en java que que pida introducir un 
  numero desde el teclado y como resultado imprima el valor 
  doble y triple de ese numero
 */
import java.util.Scanner;

/**
 * @author Carlos Burelo
 */
public class DoubleTriple {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Ingrese un numero");
    int numero = sc.nextInt();
    System.out.println("El doble de numero " + numero + "es: " + numero * 2);
    System.out.println("El triple de numero " + numero + "es: " + numero * 3);
  }
}

package FirstParcial;

/**
  4. realizar un programa en java que pida desde teclado
  el radio de una circunferencia y que calcule y muestre la
  longitud y el area de la circunferencia.
*/
import java.util.Scanner;

/**
 * @author Carlos Burelo
 */
public class AreaLongitude {
  static final double PI = 3.1416;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Ingrese un radio:");
    double longitud, area, radio = sc.nextInt();
    longitud = 2 * PI * radio;
    area = PI * Math.pow(radio, 2);
    System.out.println("La longitud es:" + longitud);
    System.out.println("El area es " + area);
  }
}

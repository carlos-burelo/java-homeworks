package SecondParcial;

import javax.swing.JOptionPane;

public class AreaForms {
  public static void main(String[] args) {
    int figure = menu();
    int base, altura;
    if (figure == 1) {
      base = input("Ingrese la base de la figura");
      altura = input("Ingrese la altura de la figura");
      int res = triangle(base, altura);
      print("EL area del triangulo es: " + res);
    } else if (figure == 2) {
      base = input("Ingrese la base de la figura");
      altura = input("Ingrese la altura de la figura");
      int res = square(base);
      print("EL area del cuadrado es: " + res);
    } else if (figure == 3) {
      int radio = input("Ingrese el radio");
      double res = circle(radio);
      print("EL area del circulo es: " + res);
    } else {
      print("La opcion no existe");
    }
  }

  public static int triangle(int base, int altura) {
    return (base * altura) / 2;
  }

  public static double circle(double radio) {
    return Math.PI * Math.pow(radio, 2);
  }

  public static int square(int base) {
    return base * base;
  }

  public static int input(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }

  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public static int menu() {
    String message = "1. Triangulo\n2. Cuadrado\n3. Circulo";
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }
}

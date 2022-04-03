package SecondParcial;

public class WhileNums {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 10;
    System.out.println("Numeros del 1 al 10");
    while (num1 <= 10) {
      System.out.println("El numero es: " + num1);
      num1++;

    }
    System.out.println("Numeros del 10 al 1");
    while (num2 >= 1) {
      System.out.println("El numero es: " + num2);
      num2--;
    }
  }
}

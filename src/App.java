import java.io.IOException;
import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int counter = 1, materias = 0, materiasCounter = 0, promedioUnico = 0,
        promedioGrupal = 0, aprobados = 0, reprobados = 0;
    while (counter <= 5) {
      materias = input("" + counter + " - Ingrese el numero de materias: ");
      int count = 1;
      while (count <= materias) {
        int calificacion = input("Ingrese la calificacion " + count + ": ");
        while (calificacion < 0 || calificacion > 10) {
          calificacion = input("Ingrese un valor valido (0 - 10): ");
        }
        materiasCounter += calificacion;
        count++;
      }
      promedioUnico = materiasCounter / materias;
      materiasCounter = 0; // reset counter for next user
      print("El promedio del alumno " + counter + " es de: " + promedioUnico);
      if (promedioUnico > 5)
        aprobados++;
      if (promedioUnico <= 5)
        reprobados++;
      promedioGrupal += promedioUnico;
      counter++;
    }
    print("El promedio general del grupo es de: " + promedioGrupal / 5);
    print("El numero de aprobados es de: " + aprobados);
    print("El numero de reprobados es de: " + reprobados);
  }

  public static int input(String message) {
    System.out.print(message);
    return sc.nextInt();
  }

  public static void print(String message) {
    System.out.println(message);
  }
}
package Otros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Promedios {
  public static int espacios = 10; // numero de elementos por arreglo
  public static String[] alumnos = new String[espacios]; // valores iniciales
  public static float[][] calificaciones = new float[espacios][10]; // valores iniciales

  public static void main(String[] args) {
    int nuevaDimension = inputInt("Ingrese el numero de alumnos: \n\n");
    alumnos = new String[nuevaDimension];
    calificaciones = new float[nuevaDimension][10];
    int option = menuPrincipal();
    while (option != 8 && option > 0) {
      switch (option) {
        case 1:
          insertar();
          break;
        case 2:
          listar();
          break;
        case 3:
          listarReprobados();
          break;
        case 4:
          listarAprobados();
          break;
        case 5:
          modificarCalificacion();
          break;
        case 6:
          guardarArchivo();
          break;
        case 7:
          obtenerPromedios();
          break;
        default:
          break;
      }
      option = menuPrincipal();
    }
  }

  public static int menuPrincipal() {
    String menu = /** Menu de opciones */
        "1. Ingresar datos\n" +
            "2. Listar datos\n" +
            "3. Lista de reprobados\n" +
            "4. Lista de aprobados\n" +
            "5. Modificar calificacion\n" +
            "6. Grabar\n" +
            "7. Obtener promedios\n" +
            "8. Salir\n";
    return Math.round(input(menu)); // para convertirlo en un numero exacto
  }
  public static void insertar() {
    // busca una posicion libre
    for (int posicion = 0; posicion < alumnos.length; posicion++) {
      if (alumnos[posicion] == null) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno\n\n").toUpperCase();
        alumnos[posicion] = nombre;
        calificar(posicion);
        break;
      }
    }
  }
  public static void calificar(int posicion) {
    calificaciones[posicion][0] = validar(input("Ingrese la calificacion del 1° parcial\n\n"));
    calificaciones[posicion][1] = validar(input("Ingrese la calificacion del 2° parcial\n\n"));
    calificaciones[posicion][2] = validar(input("Ingrese la calificacion del 3° parcial\n\n"));
    float promedio = Math.round((calificaciones[posicion][0] + calificaciones[posicion][1] + calificaciones[posicion][2]) /
        3);
    calificaciones[posicion][3] = promedio;
    if (promedio >= 9) {
      calificaciones[posicion][4] = promedio;
      calificaciones[posicion][5] = promedio;
    } else {
      calificaciones[posicion][4] = validar(input("Ingrese la calificacion del examen\n\n"));
      calificaciones[posicion][5] = calificaciones[posicion][4];
    }
  }

  public static void listar() {
    if (alumnos[0] == null) print("No hay datos todavia");
    else {
      String lista = "Todos los alumnos:\n\n";
      for (int alumno = 0; alumno < alumnos.length; alumno++) {
        if (alumnos[alumno] != null) {
          lista += "Alumno: " + alumnos[alumno] + "\n";
          lista += "Calificaciones:\n";
          lista += "1° parcial: " + calificaciones[alumno][0] + "\n";
          lista += "2° parcial: " + calificaciones[alumno][1] + "\n";
          lista += "3° parcial: " + calificaciones[alumno][2] + "\n";
          lista += "Promedio: " + calificaciones[alumno][3] + "\n";
          lista += "Examen: " + calificaciones[alumno][4] + "\n";
          lista += "Calificacion final: " + calificaciones[alumno][5] + "\n\n";
        }
      }
      print(lista);
    }

  }
  public static void listarReprobados() {
    if (alumnos[0] == null) print("No hay datos todavia");
    else {
      String lista = "Alumnos reprobados:\n\n\n";
      for (int alumno = 0; alumno < alumnos.length; alumno++) {
        if (alumnos[alumno] != null) {
          if (calificaciones[alumno][5] < 6) {
            lista += "Alumno: " + alumnos[alumno] + "\n";
            lista += "Calificacion final: " + calificaciones[alumno][5] + "\n\n";
          }
        }
      }
      print(lista);
    }
  }
  public static void listarAprobados() {
    if (alumnos[0] == null) print("No hay datos todavia");
    else {
      String lista = "Alumnos aprobados:\n\n\n";
      for (int alumno = 0; alumno < alumnos.length; alumno++) {
        if (alumnos[alumno] != null) {
          if (calificaciones[alumno][5] > 6) {
            lista += "Alumno: " + alumnos[alumno] + "\n";
            lista += "Calificacion final: " + calificaciones[alumno][5] + "\n\n";
          }
        }
      }
      print(lista);
    }
  }
  public static int seleccionarAlumno() {
    if (alumnos[0] == null) print("No hay datos todavia");
    else {
      String lista = "Alumnos:\n\n";
      for (int alumno = 0; alumno < alumnos.length; alumno++) {
        if (alumnos[alumno] != null) {
          lista += "" + alumno + ". " + alumnos[alumno] + "\n";
        }
      }
      print(lista);
    }

    return Math.round(input("Seleccione el alumno a modificar\n\n"));
  }
  public static void modificarCalificacion() {
    if (alumnos[0] == null) print("No hay datos todavia");
    else {
      int alumno = seleccionarAlumno();
      calificar(alumno);
    }

  }
  public static void guardarArchivo() {
    if (alumnos[0] == null) print("No hay datos todavia");
    else {
      String lista = "";
      for (int alumno = 0; alumno < alumnos.length; alumno++) {
        if (alumnos[alumno] != null) {
          lista += "Alumno: " + alumnos[alumno] + "\n";
          lista += "Calificaciones:\n";
          lista += "1° parcial: " + calificaciones[alumno][0] + "\n";
          lista += "2° parcial: " + calificaciones[alumno][1] + "\n";
          lista += "3° parcial: " + calificaciones[alumno][2] + "\n";
          lista += "Promedio: " + calificaciones[alumno][3] + "\n";
          lista += "Examen: " + calificaciones[alumno][4] + "\n";
          lista += "Calificacion final: " + calificaciones[alumno][5] + "\n\n";
        }
      }
      try {
        FileWriter fw = new FileWriter("alumnos.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(lista);
        bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
  public static void obtenerPromedios() {
    if (alumnos[0] == null) print("No hay datos todavia");
    else {
      String lista = "Promedio de todos los alumnos:\n\n";
      for (int alumno = 0; alumno < alumnos.length; alumno++) {
        if (alumnos[alumno] != null) {
          lista += "Alumno: " + alumnos[alumno] + "\n";
          lista += "Promedio: " + calificaciones[alumno][5] + "\n\n";
        }
      }
      float promedio = 0;
      int alumnosDisponibles = 0;
      for (int alumno = 0; alumno < alumnos.length; alumno++) {
        if (alumnos[alumno] != null) {
          promedio += calificaciones[alumno][5];
          alumnosDisponibles++;
        }
      }
      promedio = Math.round(promedio / alumnosDisponibles);
      lista += "Promedio general del grupo: " + promedio + "\n";
      print(lista);
    }

  }
  public static float input(String message) {
    return Float.parseFloat(JOptionPane.showInputDialog(null, message));
  }
  public static int inputInt(String message) {
    return Integer.parseInt(JOptionPane.showInputDialog(null, message));
  }
  public static float validar(float value) {
    while (value < 0 || value > 10) {
      value = Math.round(input("Ingrese un valor entre 0 y 10\n\n"));
    }
    return value;
  }
  public static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

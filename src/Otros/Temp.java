package Otros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Temp {
  // arreglo para 5 ciudades y 7 dias a la semana.
  public static float[] promedios = new float[5];
  public static float[][] temperaturas = new float[5][7];
  public static String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
  public static String[] ciudades = new String[5];

  public static void main(String[] args) {
    int opcion = menu();
    while (opcion != 8 && opcion >= 0) {
      if (opcion == 1) insertar();
      if (opcion == 2) listar();
      if (opcion == 3) modificar();
      if (opcion == 4) obtenerPromedios();
      if (opcion == 5) grabar();
      opcion = menu();
    }
  }

  public static void obtenerPromedios() {
    String lista = "Promedios:\n";
    float counter = 0;
    int disponibles = 0;
    for (int index = 0; index < promedios.length; index++) {
      if (promedios[index] != 0) {
        lista += ciudades[index] + ": " + promedios[index] + "\n";
        disponibles++;
        counter += promedios[index];
      }
    }
    lista += "\n\nPromedio general: " + (counter / disponibles);
    JOptionPane.showMessageDialog(null, lista);
  }

  public static void modificar() {
    String lista = "Ciudades y temperaturas\n\n";
    for (int posicion = 0; posicion < temperaturas.length; posicion++) {
      if (ciudades[posicion] != null) {
        lista += posicion + " - " + ciudades[posicion] + "\n";
      }
    }
    int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, lista));
    agregarTemperaturas(posicion);
  }
  public static int menu() {
    String menu = /** */
        "1)  Agregar temperatura\n" +
            "2)  Listar temperaturas\n" +
            "3)  Modificar temperatura\n" +
            "4)  Obtener promedios\n" +
            "5)  Grabar\n" +
            "6)  Salir\n";
    return Integer.parseInt(JOptionPane.showInputDialog(menu));
  }
  public static void grabar() {
    String lista = "Temperaturas y ciudades\n\n";
    float promedio = 0;
    for (int cuidad = 0; cuidad < ciudades.length; cuidad++) {
      if (ciudades[cuidad] != null) {
        lista += ciudades[cuidad] + "\n";
        lista += "Temperaturas\n";
        for (int dia = 0; dia < temperaturas[cuidad].length; dia++) {
          lista += dias[dia] + ":" + temperaturas[cuidad][dia] + "\n";
          promedio += temperaturas[cuidad][dia] / temperaturas[cuidad].length;
        }
        lista += "Promedio: " + promedio + "\n\n";
        promedio = 0;
      }
    }
    try {
      FileWriter fw = new FileWriter("temperaturas.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(lista);
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public static void insertar() {
    for (int posicion = 0; posicion < temperaturas.length; posicion++) {
      if (ciudades[posicion] == null) {
        ciudades[posicion] = validarCiudad(JOptionPane.showInputDialog(null, "Ingrese la ciudad:\n\n"));
        agregarTemperaturas(posicion);
        break;
      }
    }
  }
  public static void listar() {
    String lista = "Ciudades y temperaturas\n\n";
    for (int posicion = 0; posicion < temperaturas.length; posicion++) {
      if (ciudades[posicion] != null) {
        lista += posicion + " - " + ciudades[posicion] + "\n";
        for (int posicionDia = 0; posicionDia < temperaturas[posicion].length; posicionDia++) {
          String dia = dias[posicionDia];
          float temperatura = temperaturas[posicion][posicionDia];
          lista += "| " + temperatura + "°C | " + dia + "\n";
        }
      }
    }
    JOptionPane.showMessageDialog(null, lista);
  }
  public static void agregarTemperaturas(int posicion) {
    for (int dia = 0; dia < temperaturas[posicion].length; dia++) {
      temperaturas[posicion][dia] = validarTemperatura(input("Ingrese la temperatura del dia " +
          dias[dia] + ":\n\n"));
    }
    float[] temp = temperaturas[posicion];
    float promedio = ((temp[0] + temp[1] + temp[2] + temp[3] + temp[4]) / 5);
    promedios[posicion] = promedio;
  }
  public static String validarCiudad(String ciudad) {
    // validar que no sea un espacio en blanco y que no sean numeros
    while (ciudad.equals(" ") || ciudad.matches("[0-9]+") || ciudad.length() == 0) {
      ciudad = JOptionPane.showInputDialog("Ingrese una ciudad valida");
    }
    return ciudad;
  }
  public static float validarTemperatura(float temperatura) {
    while (temperatura < -20 || temperatura > 50) {
      temperatura = input("Ingrese una temperatura valida");
    }
    return temperatura;
  }
  public static float input(String message) {
    return Float.parseFloat(JOptionPane.showInputDialog(null, message));
  }
}
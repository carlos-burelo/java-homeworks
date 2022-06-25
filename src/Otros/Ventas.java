package Otros;

import javax.swing.JOptionPane;

public class Ventas {
  public static float[][] ventas = new float[5][9];
  public static String[] vendedores = new String[5];
  public static String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

  public static void main(String[] args) {
    int option = menu();
    while (option != 5) {
      if (option == 1) insertar();
      if (option == 2) listar();
      if (option == 3) modificar();
      if (option == 4) total();
      option = menu();
    }
  }
  public static int menu() {
    String menu = "Seleccione alguna opcion\n\n";
    menu += "1) Insertar datos\n";
    menu += "2) Listar datos\n";
    menu += "3) Modificar datos\n";
    menu += "4) Obtener promedios\n";
    menu += "5) Salir\n\n";
    return Math.round(input(menu));
  }
  public static void listar() {
    String lista = "Lista de vendedores\n\n";
    float ventasTotales = 0;
    for (int i = 0; i < vendedores.length; i++) {
      if (vendedores[i] != null) {
        lista += i + " - " + vendedores[i] + "\n";
        for (int j = 0; j < dias.length; j++) {
          lista += dias[j] + ": $" + ventas[i][j] + "\n";
        }
        lista += "Comision: $" + ventas[i][7] + "\n\n";
        lista += "Total: $" + ventas[i][8] + "\n\n";
        ventasTotales += ventas[i][8];
      }

    }
    lista += "Ventas totales: $" + ventasTotales;
    JOptionPane.showMessageDialog(null, lista);
  }
  public static void insertar() {
    for (int i = 0; i < ventas.length; i++) {
      if (vendedores[i] == null) {
        vendedores[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del vendedor\n\n");
        insertarVentasPorDia(i);
        break;
      }
    }
  }
  public static void modificar() {
    String lista = "Ingrese el indice del vendedor";
    for (int i = 0; i < vendedores.length; i++) {
      if (ventas[i] != null) {
        lista += i + " - " + vendedores[i] + "\n";
      }
    }
    int posicion = Math.round(input(lista));
    insertarVentasPorDia(posicion);
  }
  public static void insertarVentasPorDia(int posicion) {
    float total = 0;
    for (int j = 0; j < dias.length; j++) {
      float ventasEnElDia = input("Ventas del " + dias[j]);
      ventas[posicion][j] = ventasEnElDia;
      total += ventasEnElDia;
    }
    float comision = (float) (total * 0.12);
    ventas[posicion][7] = comision;
    ventas[posicion][8] = total;
  }
  public static void total() {
    String lista = "Registro de ventas\n\n";
    float ventaTotales = 0;
    for (int i = 0; i < vendedores.length; i++) {
      if (vendedores[i] != null) {
        float ventasPorVendedor = 0;
        for (int j = 0; j < dias.length; j++) {
          ventasPorVendedor += ventas[i][j];
        }
        ventaTotales += ventasPorVendedor;
        lista += "Vendedor(a): " + vendedores[i] + "\n";
        lista += "Ventas: $" + ventasPorVendedor + "\n\n";
      }
    }
    lista += "Ventas totales: $" + ventaTotales;
    JOptionPane.showMessageDialog(null, lista);
  }
  public static float input(String message) {
    return Float.parseFloat(JOptionPane.showInputDialog(null, message));
  }
}

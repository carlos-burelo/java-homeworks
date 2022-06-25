package Otros;

import javax.swing.JOptionPane;

// sistema de gestion de inventario
// que se almacena en una lista en memoria
public class Inventario {
  // Variables disponiples en toda la clase (variables globales)
  public static int espacios = 10; // numero de espacios disponibles para los arreglos
  public static String[] listaNombres = new String[espacios]; // espacio para los nombres
  public static int[] listaCantidades = new int[espacios]; // espacio para las cantidades
  public static float[] listaPrecios = new float[espacios]; // espacio para los precios
  public static float[] listaTotales = new float[espacios]; // espacio para los totales

  // Funciona igual que una tabla de Excel usando tablas e identificadores en base
  // a una posicion en la lista
  // Modelo
  // | ID | Nombre | Cantidad | Precio | Total |
  // | 0 | nombre1 | cantidad1 | precio1 | total1 |
  // | 1 | ....|.... |......| .... |
  // | 2 | ....|.... |......| .... |
  // los arrelos se usan para almacenar por separado, pero se relacionaran
  // por las posiciones en la lista

  public static void main(String[] args) {

    int opcion = menuPrincipal();
    while (opcion != 8 && opcion >= 0) {
      if (opcion == 1) agregarProducto();
      if (opcion == 2) listarProductos();
      if (opcion == 3) modificarPrecio();
      if (opcion == 4) consultarProducto();
      if (opcion == 5) incrementarCantidad();
      if (opcion == 6) reducirCantidad();
      if (opcion == 7) inventario();
      opcion = menuPrincipal();
    }
  }

  public static int obtenerProducto() {
    String menu = "seleccione un producto\n\n";
    for (int i = 0; i < listaNombres.length; i++) {
      if (listaNombres[i] != null) { // lista solo los elementos que no esten vacios
        menu += i + " " + listaNombres[i] + "\n"; // agrega el nombre del producto
      }
    }
    menu += "\n";
    int opcion = entrada(menu); // obtiene la opcion del usuario
    return opcion;
  }

  public static int menuPrincipal() {
    String menu = "1)  Agregar producto\n" +
        "2)  Listar productos\n" +
        "3)  Modificar precio\n" +
        "4)  Consultar productos\n" +
        "5)  Entradas\n" +
        "6)  Salidas\n" +
        "7)  Inventario\n" +
        "8)  Salir\nElige una opcion";
    return entrada(menu); // obtiene la opcion del usuario
  }

  public static void listarProductos() {
    String lista = "Inventario de productos\n\n";
    if (listaNombres[0] == null) // si no hay productos
      lista += "No hay productos en el inventario\n";
    else {
      for (int posicion = 0; posicion < espacios; posicion++) {
        if (listaNombres[posicion] != null) { // lista solo los elementos que no esten vacios
          lista += "Nombre: " + listaNombres[posicion] + "\n";
          lista += "Cantidad: " + listaCantidades[posicion] + "\n";
          lista += "Precio: $" + listaPrecios[posicion] + "\n";
          lista += "Total: $" + listaTotales[posicion] + "\n\n";
        }
      }
    }
    mostrar(lista);
  }

  public static void consultarProducto() {
    int posicion = obtenerProducto();
    // obtiene la posicion del producto
    // en base a la opcion del usuario
    mostrar(
        "Nombre: " + listaNombres[posicion] + "\n" +
            "Cantidad: " + listaCantidades[posicion] + "\n" +
            "Precio: $" + listaPrecios[posicion] + "\n" +
            "Total: $" + listaTotales[posicion] + "\n");
  }

  public static void agregarProducto() {
    // busca una posicion vacia en la lista
    for (int posicion = 0; posicion < espacios; posicion++) {
      if (listaNombres[posicion] == null) { // encuentra una posicion vacia
        // solicita los datos del producto
        listaNombres[posicion] = entradaString("Nombre del producto");
        listaCantidades[posicion] = entrada("Cantidad");
        listaPrecios[posicion] = entrada("Precio");
        listaTotales[posicion] = listaCantidades[posicion] * listaPrecios[posicion];
        break;
      }
    }
  }

  public static void modificarPrecio() {
    int posicion = obtenerProducto(); // obtiene la posicion del producto
    int precio = entrada("Nuevo precio"); // solicita el nuevo precio
    listaPrecios[posicion] = precio; // modifica el precio
    listaTotales[posicion] = listaCantidades[posicion] * precio; // modifica el total
  }

  public static void incrementarCantidad() {
    int posicion = obtenerProducto(); // obtiene la posicion del producto
    int cantidad = entrada("Cantidad a incrementar"); // solicita la cantidad a incrementar
    listaCantidades[posicion] += cantidad; // incrementa la cantidad
    listaTotales[posicion] = listaCantidades[posicion] * listaPrecios[posicion]; // modifica el total
  }

  public static void reducirCantidad() {
    int posicion = obtenerProducto(); // obtiene la posicion del producto
    int cantidad = entrada("Cantidad a reducir"); // solicita la cantidad a reducir
    int cantidadActual = listaCantidades[posicion]; // obtiene la cantidad actual
    if (cantidadActual >= cantidad) { // si la cantidad actual es mayor o igual a la a reducir
      listaCantidades[posicion] -= cantidad; // reduce la cantidad
      listaTotales[posicion] = listaCantidades[posicion] * listaPrecios[posicion]; // modifica el total
    } else { // si la cantidad actual es menor a la a reducir entonces no se puede reducir
      JOptionPane.showMessageDialog(null, "No se puede reducir mas de lo que hay");
    }
  }

  public static void inventario() {
    String lista = "Inventario de productos\n\n"; // inicializa la lista
    if (listaNombres[0] == null) // si no hay productos
      lista += "No hay productos en el inventario\n";
    else { // si hay productos
      for (int posicion = 0; posicion < espacios; posicion++) {
        if (listaNombres[posicion] != null) { // lista solo los elementos que no esten vacios
          // agrega la informacion del producto buscando en todos los arreglos
          lista += "Nombre: " + listaNombres[posicion] + "\n";
          lista += "Cantidad: " + listaCantidades[posicion] + "\n";
          lista += "Precio: $" + listaPrecios[posicion] + "\n";
          lista += "Total: $" + listaTotales[posicion] + "\n\n";
        }
      }
      // se suma el total de todos los productos en el inventario
      int total = 0;
      int stock = 0;
      for (int posicion = 0; posicion < espacios; posicion++) {
        if (listaNombres[posicion] != null) { // lista solo los elementos que no esten vacios
          total += listaTotales[posicion]; // suma el total de cada producto
          stock += listaCantidades[posicion]; // suma la cantidad de cada producto
        }
      }
      lista += "\n\nProductos en el inventario: " + stock + "\n";
      lista += "Total: $" + total + "\n";
    }

    mostrar(lista); // muestra la lista con los totales
  }

  public static int entrada(String mensaje) { // metodo para pedir una entrada desde el usuario
    return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
  }

  public static String entradaString(String mensaje) {
    // metodo para pedir una entrada desde el usuario en formato String
    return JOptionPane.showInputDialog(mensaje);
  }

  public static void mostrar(String mensaje) {
    // metodo para mostrar un mensaje en pantalla
    JOptionPane.showMessageDialog(null, mensaje);
  }
}

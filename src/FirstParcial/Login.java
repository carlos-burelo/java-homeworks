package FirstParcial;

/**
  Realizar un programa en java que lea un usuario y una contraseña
  y simule si el usuario y la contraseña son correctos.
  Sino es correcto, muestre un mensaje de error.
 */
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class Login {
  public static void main(String[] args) {
    String defaultUser = "user", defaultPassword = "1234";
    String user = input("Ingrese el usuario");
    String password = input("Ingrese la contranseña");
    if (!user.equals(defaultUser))
      print("Usuario incorrecto");
    else if (!password.equals(defaultPassword))
      print("Contraseña incorrecta");
    else
      print("Inicio de sesion exitoso\n\nBienvenido " + defaultUser);
  }

  static void print(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  static String input(String message) {
    return JOptionPane.showInputDialog(null, message);
  }
}
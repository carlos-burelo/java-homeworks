package FirstParcial;

/**
    Realizar un programa en java que obtenga un numero
    y lo trasnforme a farenheit y a celsius dependiendo
    de la escala que se elija.
 */
import javax.swing.JOptionPane;

/**
 * @author Carlos Burelo
 */
public class FarenheitToCelsius {
    public static void main(String[] args) {
        String[] options = {
                "Celsius a Farenheit",
                "Farenheit a Celsius"
        };
        int type = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Conversor de temperaturas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        double temp = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura"));
        if (type == 0) {
            double tempFarenheit = (temp * 9 / 5) + 32;
            JOptionPane.showMessageDialog(null, "La temperatura en Farenheit es: " + tempFarenheit + "°F");
        } else {
            double tempCelsius = (temp - 32) * 5 / 9;
            JOptionPane.showMessageDialog(null, "La temperatura en Celsius es: " + tempCelsius + "°C");
        }
    }
}

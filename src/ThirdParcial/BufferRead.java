package ThirdParcial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferRead {
  public static void main(String[] args) {
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    String input = "";
    try {
      input = bufer.readLine();
      System.out.println(input);
    } catch (IOException e) {
      System.out.println("Error al leer la entrada");
    }
  }
}

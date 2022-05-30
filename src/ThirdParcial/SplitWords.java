package ThirdParcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplitWords {
  public static void main(String[] args) throws IOException {
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    String[] words = b.readLine().split(" ");
    System.out.println("Se ingresaron: " + words.length + " palabras");
  }
}

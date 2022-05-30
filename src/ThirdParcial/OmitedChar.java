package ThirdParcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OmitedChar {
  public static void main(String[] args) throws IOException {
    char[] abc = new char[26];
    for (int i = 0; i < 26; i++)
      abc[i] = (char) ('a' + i);
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String cadena = buffer.readLine();
    for (int i = 0; i < cadena.length(); i++) {
      if (cadena.charAt(i) != ' ')
        abc[cadena.charAt(i) - 'a'] = ' ';
      System.out.println(abc);
    }
  }
}

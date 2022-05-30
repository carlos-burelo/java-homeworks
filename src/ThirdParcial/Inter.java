package ThirdParcial;

public class Inter {

  public static void main(String[] args) {
    String str1 = "hola";
    String str2 = "mundo";
    String str3 = "";
    int len1 = str1.length(), len2 = str2.length();
    int limite = len1 > len2 ? len1 : len2;
    for (int i = 0; i < limite; i++) {
      // si la posicion no existe en la cadena no la agrega;
      if (i < len1)
        str3 += str1.charAt(i);
      if (i < len2)
        str3 += str2.charAt(i);
    }
    System.out.println(str3);
  }
}

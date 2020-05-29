
package Unidade04;
import java.io.IOException;
import java.lang.StringBuffer;
import java.lang.NumberFormatException;

/**
 * Classe que fornece m�todos abstratos para leitura do teclado
 */
class Entrada {
    private static String EntradaLeiaInt () {
      int in = 0;
      char chr;
      boolean sinal = false;
      StringBuffer Valor = new StringBuffer(""); //armazena valor correto
      do {
         try {
            in = System.in.read();
            chr = (char) in;
            if ((in != 10) & (in != 13)) {
               if (in >= 48 && in <= 57 || (in == 45 && !sinal)) {
                  Valor.append(chr);
                  sinal = true;
               }
            }
         } catch (IOException e) {}
      } while (in != 10);
      return Valor.toString();
   }

   
      private static String EntradaLeiaLong () {
      int in = 0;
      char chr;
      boolean sinal = false;
      StringBuffer Valor = new StringBuffer(""); //armazena valor correto
      do {
         try {
            in = System.in.read();
            chr = (char) in;
            if ((in != 10) & (in != 13)) {
               if (in >= 48 && in <= 57 || (in == 45 && !sinal)) {
                  Valor.append(chr);
                  sinal = true;
               }
            }
         } catch (IOException e) {}
      } while (in != 10);
      return Valor.toString();
   }

   private static String EntradaLeiaFloat () {
      int in = 0;
      char chr;
      boolean ponto = false;
      boolean sinal = false;
      StringBuffer Valor = new StringBuffer("");
      
      do {
         try {
            in = System.in.read();
            chr = (char) in;
            if ((in != 10) & (in != 13)) {
               if (in >= 48 && in <= 57 || in == 46 || ( in == 45 && !sinal )) {
                  if ( in == 46 ) {
                     if ( ! ponto ) {
                        Valor.append(chr);
                        ponto = true;
                     }
                  } else {
                     Valor.append(chr);
                  }
                  sinal = true;
               }
            }
         } catch (IOException e) {}
      } while (in != 10);
      return Valor.toString();
   }
   
   /**
    * L�r um int do teclado
    * @result int lido
    */
   public static int leiaInt () {
      int retorno;
      
      try {
         retorno = Integer.parseInt(EntradaLeiaInt());
      } catch (NumberFormatException e) {
         retorno = 0;
      }
      
      return retorno;
   }
   
  /**
    * L�r um long do teclado
    * @result long lido
    */
   public static long leiaLong () {
      long retorno;
      
      try {
         retorno = Integer.parseInt(EntradaLeiaLong());
      } catch (NumberFormatException e) {
         retorno = 0;
      }
      
      return retorno;
   }
   
   /**
    * L�r um float do teclado
    * @result float lido
    */
   public static float leiaFloat () {
      float retorno;
      try {
         retorno = Float.parseFloat(EntradaLeiaFloat());
      } catch (NumberFormatException e) {
         retorno = 0;
      }
      return retorno;
   }


   /**
    * L�r um double do teclado
    * @result double lido
    */
   public static double leiaDouble () {
      double retorno;
      try {
         retorno = Double.parseDouble(EntradaLeiaFloat());
      } catch (NumberFormatException e) {
         retorno = 0;
      }
      return retorno;
   }
   
   /**
    * L�r um char do teclado
    * @result char lido
    */
   public static char leiaChar () {
      int in = 0;
      char chr;
      int cont = 0;
      StringBuffer Valor = new StringBuffer("");
      do {
         try {
            in = System.in.read();
            chr = (char) in;
            if ((in != 10) & (in != 13)) {
               if ( cont == 0 ) {
                  Valor.append(chr);
               }
               cont++;
            }
         } catch (IOException e) {}
      } while (in != 10);
      return Valor.charAt(0);
   }
   
   /**
    * L�r um String do teclado
    * @result String lido
    */
   public static String leiaString () {
      int in = 0;
      char chr;
      StringBuffer Valor = new StringBuffer("");
      do {
         try {
            in = System.in.read();
            chr = (char) in;
            if ((in != 10) & (in != 13)) {
               Valor.append(chr);
            }
         } catch (IOException e) {}
      } while (in != 10);
      return Valor.toString();
   }
   
   public static int leiaInt(String Mensagem){
     System.out.print(Mensagem);
     return leiaInt();
   }
   
   public static long leiaLong(String Mensagem){
     System.out.print(Mensagem);
     return leiaLong();
   }
   public static float leiaFloat(String Mensagem){
     System.out.print(Mensagem);
     return leiaFloat();
   }
   public static double leiaDouble(String Mensagem){
     System.out.print(Mensagem);
     return leiaDouble();
   }
   public static char leiaChar(String Mensagem){
     System.out.print(Mensagem);
     return leiaChar();
   }
   public static String leiaString(String Mensagem){
     System.out.print(Mensagem);
     return leiaString();
   }
}   

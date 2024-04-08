import java.util.Arrays;

public class MeReverteAi {

    static String deTrasPraFrente(String palavra) {

         String auxiliar = "";

         for(int i = (palavra.length() - 1); i >= 0; i--) {
             auxiliar = auxiliar + palavra.charAt(i);
        };
         return auxiliar;
    };
}

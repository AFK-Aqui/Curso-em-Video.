import java.util.Arrays;

public class Exemplo6 {
    public static void main(String[] args) {

    /* -------------------------------------------
       Nova forma de atribuição de valores a Vetores
       utilizando a classe "Arrays".
    ---------------------------------------------- */

    int y[] = new int[20];

    Arrays.fill(y, 5); // Método "fill".

    /* ---------------------------------------------
      O método "fill" ira preencher todos os valores
      do Vetor com o número desejado. 
    ------------------------------------------------- */

    for(int valor: y) {

        System.out.print(valor + " ");

    }
    
    }
}

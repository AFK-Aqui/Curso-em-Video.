import java.util.Arrays;


public class Exemplo4 {
    public static void main(String[] args) {

    // ----------- Vetores: Aula 04. ------------- //

        int num[] = {3, 5, 1, 8, 9};

        // !!!!!!!!!!!! NOVA CLASSE. !!!!!!!!!!!!! //

        Arrays.sort(num);

        // A classe "Arrays" coloca os valores dos veotres em ordem.

        for (int valor: num) { 
            
        /*  ------------------------------------------------
            Aqui está um exemplo de "For-Each", que e feito 
            exclusivamente para ser usado com Vetores. 
            -----------------------------------------------  */

            System.out.println(valor);

        /*  ----------------------------------------------------------------
            O comando do "sout" aqui mostrara cada repetição que o "for" fará,
            ele irá passar pelo valor do primeiro local até chegar ao último.
            ----------------------------------------------------------------  */

        }
    }
}

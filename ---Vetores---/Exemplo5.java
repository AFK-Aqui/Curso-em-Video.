import java.util.Arrays;

public class Exemplo5 {
    public static void main(String[] args) {

    int vet[] = {3, 7, 6, 1, 9, 4, 2};

    for(int v : vet) { // Ele mostrara todos os valores do Vetor.

        System.out.print(v + "  ");

    }

    System.out.println("");

    int p = Arrays.binarySearch(vet, 8);

    /* ------------------------------------------------------
       O método "binarySearch" vai procurar o valor desejado
       dentro do vetor escolhido tbm. 
    --------------------------------------------------------- */

    System.out.println("Encontrei o valor na posição " + p);

    }
}

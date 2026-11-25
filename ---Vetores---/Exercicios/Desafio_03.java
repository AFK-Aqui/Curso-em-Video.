package Exercicios;

import java.util.Scanner;

public class Desafio_03 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {

            int t[] = new int[5];
            int r = 0;

            for (int v = 0; v < t.length; v++) {

                System.out.print("Digite um número: ");
                t[v] = leitor.nextInt();

                r += t[v];
            }

            int maior = t[0];
            int menor = t[0];

            for (int y = 1; y < t.length; y++) {

                if (t[y] > maior) {
                    maior = t[y];
                }

                if (t[y] < menor) {
                    menor = t[y];
                }
            }

            double m = (double) r / t.length;

            System.out.println("===== RESULTADOS =====");

            System.out.println("Soma dos elementos: " + r);
            System.out.println("Média dos elementos: " + m);

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);

}
    }
}

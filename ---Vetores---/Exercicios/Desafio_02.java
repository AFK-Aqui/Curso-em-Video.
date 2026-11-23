package Exercicios;

import java.util.Scanner;

public class Desafio_02 {
    public static void main(String[] args) {

    try(Scanner leitor = new Scanner(System.in)) {

    int v[] = new int[5];

    System.out.print("Digite o 1º número: ");
    v[0] = leitor.nextInt();

    System.out.print("Digite o 2º número: ");
    v[1] = leitor.nextInt();

    System.out.print("Digite o 3º número: ");
    v[2] = leitor.nextInt();

    System.out.print("Digite o 4º número: ");
    v[3] = leitor.nextInt();

    System.out.print("Digite o 5º número: ");
    v[4] = leitor.nextInt();

    System.out.println("Números armazenados:");

    for(int valor: v) {

    System.out.print(valor + " ");

    }

    System.out.println("");

}

    }
}

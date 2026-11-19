public class Exemplo2 {
    public static void main(String[] args) {

        // --------------- Vetores ---------------- //

        int n[] = {7, 4, 1, 3}; // Uso direto de aplicação de valores.

        for (int cc = 0; cc < n.length; cc++) {

        /* ------------------------------------------------------------------
           O "length" é uma extensão de Vetores, que significa "comprimento".
           Ele é utilizado para ver quantos locais ou objetos existem.
           ------------------------------------------------------------------ */

            System.out.println("Na posição " + cc + " Temos o valor: " + n[cc]);

        }
    }
}

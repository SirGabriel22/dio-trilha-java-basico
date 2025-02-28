public class TiposVariaveis {
    public static void main(String[] args) {
        //Casting:

        short numero = 1;
        int numeroInteiro = numero;
        short outroNumero = (short) numeroInteiro;

        System.out.println(outroNumero);

        /* Operadores:
        == igualdade
        != diferença
        && e
        || ou
        ! não
        < menor que
        > maior que
        <= menor ou igual
        > maior ou igual */

        /*-------------------------------------- */


        // Atribuições

        String nome = "Gabriel"; // String, isso é texto
        int idade = 30; // Número inteiro
        double peso = 80.0; // Número real
        char sexo = 'M'; // Caracter
        boolean destro = true; // Valor lógico
        //Date dataNascimento = new Date(); // data

        // Operadores
        double soma = 10.7 + 15.4; // Soma com números reais.
        int subtracao = 113 - 25; // Subtração de números inteiros.
        int multiplicacao = 20 * 7; // Multiplicação de números inteiros.
        int divisao = 15/3; // Divisão de números inteiros.
        int resto = 14 % 3; // Resto da divisão de inteiros.
        double operacao = (14 * 3) + (20/5);

        // Concatenação: Concatenamos strings usando '+', como em python.
        String nomeCompleto = "Linguagem " + "Java";

        System.out.println(nomeCompleto);

        /*----------------------------------------- */

        //Operadores unários

        int num = 5;

        System.out.println(- num); // Entretanto, num permanece positivo.
        System.out.println(!true); // Impressão de valor booleano
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1) Observe o trecho de código abaixo:

        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE)

        {

            K = K + 1;

            SOMA = SOMA + K;

        }

        System.out.println(SOMA); // RESPOSTA É: 91

        // 2) Sequência de Fibonacci

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número! ");
        double numero = input.nextDouble();

        for (int i = 0; i <= numero; i++) {
            double num = Fibonacci.fibonacci(i);
            if(i == num) {
                System.out.println("O número informado pertence a sequência de Fibonacci: " + num);
            }
            System.out.println("i = " + num);
        }

        // 3)

        // alternativa A --> 9
        // alternativa B --> 128
        // alternativa C --> 49
        // alternativa D --> 100
        // alternativa E --> 13
        // alternativa F --> 20


        // 4)
        /* Isso é pergunta pra quem vai em Caps, viu. Mas vamos lá:
        Primeiro eu acenderia dois interruptores e deixaria esquentar a lâmpada. A partir daí,
        é possível saber quais interruptores são os mais cotados para aquelas salas.

        Segundo, eu ligaria o interruptor derradeiro e ia para a sala que não teve sua lâmpada acessa.
        Dessa forma, eu saberia exatamente qual sala o terceiro interruptor acenderia. E, assim, o
        problema estaria resolvido
        */

        // 5)



        System.out.println("Digite uma palavra e veja a mágica aparecer!! ");
        String palavra = input.next();

        String palavraInvertidaNaMaoGrade = MeReverteAi.deTrasPraFrente(palavra);

        System.out.println("Pega tua palavra invertida, besta fera: " + palavraInvertidaNaMaoGrade);

        input.close();

    }
}
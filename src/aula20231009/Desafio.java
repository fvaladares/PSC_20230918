package aula20231009;

import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public void desafio() {
        // Inicializa o random com o tempo corrente em milissegundos
        Random rand = new Random(System.currentTimeMillis());
        int respostaEsperada = rand.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);
        int respostaDada = 0;
        int LIMITE = 3;
        System.out.println(respostaEsperada);

        System.out.println("Jogo de adivinhação, você tem três chances de advinhar um número entre 1 e 10");
        for (int i = 1; i <= LIMITE; i++) {
            System.out.print("Informe sua resposta: ");
            respostaDada = input.nextInt();
            if (respostaDada == respostaEsperada) {
                System.out.println("Parabéns, você acertou!!!");
                break;
            } else if ((respostaDada > respostaEsperada) && i != LIMITE) {
                System.out.println("O valor informado é maior do que a resposta.");
            } else if (i != LIMITE ) {
                System.out.println("O valor informado é menor do que a resposta.");
            } else {
                System.out.println("You lose!!!!!!");
            }
//
//            if (i == LIMITE) {
//                System.out.println("You LOSE!!!");
//            }
        }
    }
}

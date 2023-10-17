import aula16102023.Quadrado;
import aula20230925.ImparOuPar;
import aula20230925.LimitarCasasDecimais;
import aula20230925.SucessoEmAlgoritmos;
import aula20231009.Desafio;
import aula20231009.Exponenciacao;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void teste() {
        Random rand = new Random();
        int resposta = rand.nextInt(10) + 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(10));
        }
    }

    public static void main(String[] args) {
//            teste();
//        aulaPassada();
//        ImparOuPar ip = new ImparOuPar();
////        while (true) {
//        Exponenciacao e = new Exponenciacao();
//
//        e.exponenciacao(2, 4);
//        e.exponenciacao(5, 3);
//
//        Desafio d = new Desafio();
////
//        d.desafio();
        Scanner input = new Scanner(System.in);
        // Cria um objeto que armazena a função responsável
//         por imprimir um quadrado;
        /*
        Quadrado - nome da class
        quadrado - nome do objeto(variável)
        new - Cria uma instância da classe (permite usar o arquivo
        criado separadamente)
        Quadrado(); -> Tipo do dado que será utilizado (Nome da classe)
         */
        Quadrado quadrado = new Quadrado();
        int tamanhoQuadrado;
        System.out.print("Por favor, informe o tamanho do quadrado");
        tamanhoQuadrado = input.nextInt();
        System.out.println();
        quadrado.imprimirQuadrado(tamanhoQuadrado);
        System.out.println();
        quadrado.imprimirDiagonalSuperior(tamanhoQuadrado);
        System.out.println();
        quadrado.imprimirDiagonalCrescenteParaDireita(tamanhoQuadrado);
        System.out.println("Fim do programa");


//            SucessoEmAlgoritmos sal = new SucessoEmAlgoritmos();
//            sal.sucessoEmAlgoritmos();
//            ip.definirParOuImpar();L
//        }


    }

    private static void aulaPassada() {
        while (true) {
            double entrada; // variável de entrada
            // Objeto responsável pela leitura de dados
            Scanner input = new Scanner(System.in);
            // Classe que realiza a operação.
            PositivoNegativoNulo pnn = new PositivoNegativoNulo();
            System.out.print("Por favor, informe um número: ");

            // Leitura dos dados
            entrada = input.nextDouble();
            System.out.println();
            // chamada do método.
            pnn.decisao(entrada);

            LimitarCasasDecimais lcd = new LimitarCasasDecimais();

            lcd.limitarDigitos();


//            System.out.print("Por favor, informe um número: ");
//            entrada = input.nextDouble();
//            System.out.println();
//            if (entrada != 0) {
//                System.out.println("Entrou no if");
//                System.out.println(entrada +
//                        " não é nulo");
//            } else {
//                System.out.println("Entrou no else");
//                System.out.println(entrada +
//                        " é nulo");
//            }
//            System.out.println("Comando após o if");
            input.nextLine();

            System.out.println("\n\n");
        }
    }
}

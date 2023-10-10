package aula20230925;

import java.util.Scanner;

public class ImparOuPar {
    public void definirParOuImpar() {
// region:Comece aqui
        Scanner leitor = new Scanner(System.in);
        double valor;

        System.out.print("\nPor favor," +
                " informe um número para saber " +
                "se ele é ímpar: ");

        // Leitura do dado solicitado à pessoa
        valor = leitor.nextDouble();

        // Pega o resto da divisão por dois
//         e valida se é diferente de zero.
        if(valor == 0) {
            System.out.println("O número é nulo.");
        } else if ((valor % 2) != 0) {
            System.out.println("O número é ímpar.");
        } else {
            System.out.println("O número é par");
        }
// endregion
    }
}

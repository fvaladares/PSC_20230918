package aula20230925;

import java.util.Scanner;

public class SucessoEmAlgoritmos {
    /**
     * Faça um lagoritmo para determinar
     * o sucesso de um determinado aluno
     * na disciplina de programação.
     * <p>
     * Deve-se exibir a seguinte pergunta:
     * "Você estudou algoritmos no final de semana?
     * Repostas:
     * - Parabéns, se a resposta for sim;
     * - Você precisa se esforçar mais, se a resposta for não
     * - IMpossível determinar, se a resposta for diferente.
     */
    public void sucessoEmAlgoritmos() {
        Scanner entrada = new Scanner(System.in);
        String resposta;
        System.out.println("Você estudou algoritmos " +
                "no final de semana?\nSim ou não?");
        resposta = entrada.nextLine();
        if (resposta.trim().equalsIgnoreCase("sim")) {
            System.out.println("Parabéns, continue assim!!");
        } else if (resposta.trim().equalsIgnoreCase("não")) {
            System.out.println("Nos veremos no próximo semestre!");
        } else {
            System.out.println("Impossível determinar");
        }
    }
}

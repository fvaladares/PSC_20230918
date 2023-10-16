package aula16102023;

public class Quadrado {
    public void imprimirQuadrado(int tamanhoQuadrado) {
        // Controla as linhas
        // (executado de forma mais "lenta"
        // Uma iteração para cada "tamanho quadrado"
        // do for interno.
        for(int i = 0; i < tamanhoQuadrado; i++) {
            // Controla as colunas
            // Executado de forma mais "rápida"
            // "tamanhoQuadrado" iterações para cada
            // iteração do for externo.
            for (int j = 0; j < tamanhoQuadrado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

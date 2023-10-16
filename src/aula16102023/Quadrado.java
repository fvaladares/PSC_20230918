package aula16102023;

public class Quadrado {
    public void imprimirQuadrado(int tamanhoQuadrado) {
        for(int i = 0; i < tamanhoQuadrado; i++) {
            for (int j = 0; j < tamanhoQuadrado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

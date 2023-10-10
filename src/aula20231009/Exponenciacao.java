package aula20231009;

public class Exponenciacao {
    /*
    base = 2
    expoente = 2
    resposta = 2
     */
    public void exponenciacao(int base, int expoente) {
        int resposta = base;
        for (int i = 1; i < expoente; i++) {
            resposta *= base; // resposta = resposta * base;
        }
        System.out.println(base
                + "^"
                + expoente
                + " = "
                + resposta);
    }
}

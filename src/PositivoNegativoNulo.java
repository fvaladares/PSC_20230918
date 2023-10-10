public class PositivoNegativoNulo {
    public void decisao(Double valor) {
        if (valor > 0) {
            System.out.println("O número informado " +
                    valor + " é positivo!");
        } else if (valor < 0) {
            System.out.println("O número informado " +
                    valor + " é negativo!");
        } else {
            System.out.println("O número informado " +
                    valor + " é nulo!");
        }
    }
}

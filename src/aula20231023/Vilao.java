package aula20231023;

/*
protected - Acessado por especializações da classe.
private - Só pode ser acessado pelo próprio objeto
public - Público - acessível a partir de qualquer lugar.
 */
public class Vilao {
    public String nome;
    public String habilidade;
    private int vida = 100;
    public int mana;

    public void atacar() {
        System.out.println("Atacando.");
    }

    public int oberQuantidadeMana() {
        return mana;
    }

    public Boolean configurarVida(int vida)  {
        if (vida > 0) {
            this.vida = vida;
            return true;
        } else {
            this.vida = 0;
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome "
                + this.nome
                + " vida "
                + this.vida
                + " Mana "
                + this.mana
                + " habilidade "
                + this.habilidade;
    }
}

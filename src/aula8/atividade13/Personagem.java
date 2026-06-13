package aula8.atividade13;

abstract class Personagem {
    String nome;
    int hp;
    Arma arma = new Arma();

    public Personagem(String nome, int hp,Arma arma) {
        this.nome = nome;
        this.hp = hp;
        this.arma = arma;
    }

    public abstract void atacar(Personagem alvo);

    @Override
    public String toString() {
        return nome;
    }
}

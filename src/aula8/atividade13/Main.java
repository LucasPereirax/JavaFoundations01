package aula8.atividade13;

public class Main {
    public static void main(String[] args) {
        Arqueiro arqueiro = new Arqueiro("Arqueiro", 90, "Arco e Flecha", 20);
        Mago mago = new Mago("Mago", 120, "Cajado", 30);
        Guerreiro guerreiro = new Guerreiro("Guerreiro", 150, "Espada", 50);

        mago.atacar(guerreiro);
    }
}

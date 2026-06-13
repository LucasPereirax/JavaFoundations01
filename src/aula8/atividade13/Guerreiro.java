package aula8.atividade13;

import javax.swing.*;

public class Guerreiro extends Personagem{

    public Guerreiro(String nomeG, int hp, String nome, int dano) {
        super(nomeG, hp,new Arma(dano, nome));
    }

    @Override
    public void atacar(Personagem alvo) {
        JOptionPane.showMessageDialog(null, "Guerreiro acerta um golpe de espada no "+alvo);
        alvo.hp = alvo.hp- arma.dano;
        JOptionPane.showMessageDialog(null, "Nova vida do "+alvo+" é igual a: "+alvo.hp);
    }
}

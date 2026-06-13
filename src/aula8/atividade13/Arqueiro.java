package aula8.atividade13;

import javax.swing.*;

public class Arqueiro extends Personagem{
    public Arqueiro(String nomeArq,int hp, String nome, int dano) {
        super(nomeArq, hp,new Arma(dano,nome));
    }

    @Override
    public void atacar(Personagem alvo) {
        JOptionPane.showMessageDialog(null, "Arqueiro acerta uma flecha envenenada no "+alvo);
        alvo.hp = alvo.hp- arma.dano;
        JOptionPane.showMessageDialog(null, "Nova vida do "+alvo+" é igual a: "+alvo.hp);
    }
}

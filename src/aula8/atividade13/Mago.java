package aula8.atividade13;

import javax.swing.*;

public class Mago extends Personagem{
    public Mago( String nomeM, int hp, String nome, int dano) {
        super(nomeM, hp,new Arma(dano, nome));
    }

    @Override
    public void atacar(Personagem alvo) {
            JOptionPane.showMessageDialog(null, "Mago acerta a magia das trevas no "+alvo);
            alvo.hp = alvo.hp- arma.dano;
            JOptionPane.showMessageDialog(null, "Nova vida do "+alvo+" é igual a: "+alvo.hp);
    }
}


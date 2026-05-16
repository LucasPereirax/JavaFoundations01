package aula5.atividade05;

import javax.swing.*;

public class Cachorro extends Animal{
    String raca;

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Au Au");
    }

    public Cachorro(String raca) {
        super();
        this.raca = raca;
    }
}

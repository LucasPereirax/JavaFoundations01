package atividade12;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        cadastro.entradaDados();
        cadastro.calculaMedia();
        JOptionPane.showMessageDialog(null,cadastro.retorno());
    }
}

package aula5.atividade05;

import javax.swing.*;

public class Animal {
    String nome;
    int idade;

    public void emitirSom(){
        JOptionPane.showMessageDialog(null, "Som genérico de animal");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

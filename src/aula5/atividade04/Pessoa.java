package aula5.atividade04;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public void exibirPessoa(){
        JOptionPane.showMessageDialog(null,
                "Nome: " + this.nome + "\n" +
                        "Idade: " + this.idade + "\n" +
                        "CPF: " + this.cpf
        );
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11){
            JOptionPane.showMessageDialog(null,"CPF incorreto!");
        }else {
            this.cpf = cpf;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade <= 130){
            this.idade = idade;
        }else {
            JOptionPane.showMessageDialog(null,"Idade inválida!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty() || nome.equals("")){
            JOptionPane.showMessageDialog(null,"O nome não pode ser vazio o nulo");
        }else{
            this.nome = nome;
        }
    }
}

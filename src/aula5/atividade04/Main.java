package aula5.atividade04;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        String nome = JOptionPane.showInputDialog("Digite o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        String cpf =JOptionPane.showInputDialog("Digite o cpf");
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setCpf(cpf);
        pessoa.exibirPessoa();
    }
}

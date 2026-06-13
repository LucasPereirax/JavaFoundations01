package aula8.atividade12;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // ... (Seu código de criação de Aluno, Funcionario e Livros permanece igual)
        Aluno aluno = new Aluno();
        aluno.setNome("Lucas");
        aluno.setCpf("123");
        aluno.matricula = "111";

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Fabio");
        funcionario.setCpf("321");
        funcionario.cargo = "gerente";

        Livro livro1 = new Livro();
        livro1.autor = "Joao";
        livro1.disponivel = true;
        livro1.isbn = "sla";
        livro1.titulo = "POO";

        Livro livro2 = new Livro();
        livro2.autor = "Alberto";
        livro2.disponivel = true;
        livro2.isbn = "lll";
        livro2.titulo = "Mouses";

        Livro livro3 = new Livro();
        livro3.autor = "Gabriel";
        livro3.disponivel = true;
        livro3.isbn = "yty";
        livro3.titulo = "Teclados";

        Livro livro4 = new Livro();
        livro4.autor = "Lara";
        livro4.disponivel = true;
        livro4.isbn = "çç";
        livro4.titulo = "kkk";

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        while (true) {
            String inputOpcao = JOptionPane.showInputDialog("Digite:\n1 - Emprestar\n2 - Devolver\n"+ biblioteca.livros);
            int opcao = Integer.parseInt(inputOpcao);
            if (opcao == 1) {
                String nome = JOptionPane.showInputDialog("Digite o título do livro para emprestar: "+biblioteca.livros);
                boolean encontrado = false;

                for (Livro livro : biblioteca.livros) {
                    if (livro.titulo.equalsIgnoreCase(nome) && livro.disponivel) {
                        biblioteca.emprestar(livro, aluno);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "O Livro: " + nome + " não está disponível ou não existe.");
                }
            } else if (opcao == 2) {
                String nomeD = JOptionPane.showInputDialog("Digite o título do livro para devolver: "+biblioteca.livrosEmprestados);
                boolean encontrado = false;

                for (Livro livro : biblioteca.livrosEmprestados) {
                    if (livro.titulo.equalsIgnoreCase(nomeD)) {
                        biblioteca.devolver(livro);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "O Livro: " + nomeD + " não foi encontrado na lista de emprestados.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O número digitado não está entre as opções.");
            }
        }
    }
}

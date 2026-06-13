package aula8.atividade12;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();
    List<Livro> livrosEmprestados = new ArrayList<>();

    void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    void emprestar(Livro l, Pessoa p){
        if (!l.disponivel){
            JOptionPane.showMessageDialog(null, "Este livro não está disponível.");
        } else {
            l.disponivel = false;
            livrosEmprestados.add(l);
            livros.remove(l);
            JOptionPane.showMessageDialog(null, "O Livro: " + l.titulo + " acaba de ser emprestado para: " + p.getNome());
        }
    }

    void devolver(Livro l){
        if (l.disponivel){
            JOptionPane.showMessageDialog(null, "Este livro " + l.titulo + " já está na biblioteca.");
        } else {
            l.disponivel = true;
            livrosEmprestados.remove(l);
            livros.add(l);
            JOptionPane.showMessageDialog(null, "O Livro: " + l.titulo + " acaba de ser devolvido!");
        }
    }
}

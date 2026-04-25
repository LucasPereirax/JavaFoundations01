package atividade1a9;

import javax.swing.*;

public class atv01 {
    public static void main(String[] args) {
        //atividade 01
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        System.out.println("Bem-vindo(a) à Estação Órbita-1, "+nome+"! Idade registrada: "+idade+" anos.");
    }
}

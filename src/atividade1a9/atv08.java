package atividade1a9;

import javax.swing.*;

public class atv08 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        boolean acesso = idade >=16;
        System.out.println(acesso? "Entrada liberada":"Entrada não permitida");
    }
}

package atividade1a9;

import javax.swing.*;

public class atv07 {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção de 1 a 3: "));
        switch (opcao){
            case 1:
                JOptionPane.showMessageDialog(null,"Saudação");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Despedida");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Piada");
                break;
            default:
                JOptionPane.showMessageDialog(null,"DIGITE UMA OPÇÃO VÁLIDA DE 1 A 3");
        }
    }
}

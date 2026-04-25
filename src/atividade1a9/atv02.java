package atividade1a9;

import javax.swing.*;

public class atv02 {
    public static void main(String[] args) {
        int variacapEnergia = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da poção: "));
        if (variacapEnergia < 0){
            System.out.println("O valor é negativo");
        } else if (variacapEnergia == 0) {
            System.out.println("O valor é igual a 0");
        }else{
            System.out.println("O valor é positivo");
        }

    }
}

package atividade1a9;

import javax.swing.*;

public class atv03 {
    public static void main(String[] args) {
        int credencial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da sua credencial"));
        if (credencial%2 == 0 && credencial%5 ==0){
            System.out.println("Seja bem-vindo, acesse pelo portão A com selo VIP");
        } else if (credencial%2 != 0 && credencial%5 == 0) {
            System.out.println("Seja bem-vindo, acesse pelo portão B com selo VIP");
        } else if (credencial%2 == 0 && credencial%5 != 0) {
            System.out.println("Seja bem-vindo, acesse pelo portão A com o selo comum");
        }else{
            System.out.println("Seja bem-vindo, acesse pelo portão B com o selo comum");
        }
    }
}

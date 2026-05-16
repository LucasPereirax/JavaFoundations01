package aula5.atividade03;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Lucas","122");

        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
        conta1.depositar(deposito);

        double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
        conta1.sacar(saque);
        conta1.exibirExtrato();

    }
}

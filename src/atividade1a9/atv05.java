package atividade1a9;

import javax.swing.*;

public class atv05 {
    public static void main(String[] args) {
        double quantidadeChuva = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de chuva nas últimas 24h: "));
        if (quantidadeChuva > 60){
            JOptionPane.showMessageDialog(null,"O valor informado "+quantidadeChuva+" Indica emergência!");
        } else if (quantidadeChuva > 30 && quantidadeChuva<=60) {
            JOptionPane.showMessageDialog(null,"O valor informado "+quantidadeChuva+" Indica alerta!");
        } else if (quantidadeChuva > 10 && quantidadeChuva<=30) {
            JOptionPane.showMessageDialog(null,"O valor informado "+quantidadeChuva+" Indica atenção!");
        }else{
            JOptionPane.showMessageDialog(null,"O valor informado "+quantidadeChuva+" Indica sem alerta");
        }
    }
}

package atividade1a9;

import javax.swing.*;

public class atv06 {
    public static void main(String[] args) {
        double tempF = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fº: "));
        double converteC = (tempF - 32)/9;
        String valorFormatado = String.format("%.1f", converteC);
        if (converteC < 20){
            JOptionPane.showMessageDialog(null, "o valor informado em Fº é: "+tempF+", convertendo para Cº é "+valorFormatado+" isso indica Frio (monitorar)");
        } else if (converteC >= 20 && converteC<30) {
            JOptionPane.showMessageDialog(null, "o valor informado em Fº é: "+tempF+", convertendo para Cº é "+valorFormatado+" isso indica normal");
        } else if (converteC >= 30 && converteC<40) {
            JOptionPane.showMessageDialog(null, "o valor informado em Fº é: "+tempF+", convertendo para Cº é "+valorFormatado+" isso indica Quente (aumentar ventilação)");
        } else if (converteC >= 40 && converteC<50) {
            JOptionPane.showMessageDialog(null, "o valor informado em Fº é: "+tempF+", convertendo para Cº é "+valorFormatado+" isso indica  Crítico (reduzir carga)");
        }else {
            JOptionPane.showMessageDialog(null, "o valor informado em Fº é: "+tempF+", convertendo para Cº é "+valorFormatado+" isso indica Desligamento de emergência");
        }
    }
}

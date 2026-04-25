package atividade1a9;

import javax.swing.*;

public class atv09 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        String operacao = JOptionPane.showInputDialog("Digite a operação: \npara soma:+\npara subtração:-\npara multiplicação:*\npara divisão:/");
        double total;
        switch (operacao){
            case "+":
                total=num1 + num2;
                JOptionPane.showMessageDialog(null,"O valor de "+num1+" + "+num2+" é: "+total);
                break;
            case "-":
                total=num1 - num2;
                JOptionPane.showMessageDialog(null,"O valor de "+num1+" - "+num2+" é: "+total);
                break;
            case "*":
                total=num1 * num2;
                JOptionPane.showMessageDialog(null,"O valor de "+num1+" * "+num2+" é: "+total);
                break;
            case "/":
                if (num2 ==0){
                    JOptionPane.showMessageDialog(null,"Frasco vazio: divisão por zero!");
                    break;
                }
                total=num1 / num2;
                JOptionPane.showMessageDialog(null,"O valor de "+num1+" / "+num2+" é: "+total);
                break;
            default:
                JOptionPane.showMessageDialog(null, "DIGITE UMA OPÇÃO VÁLIDA");
        }
    }
}

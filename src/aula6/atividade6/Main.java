package aula6.atividade6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("kkkkkkkkkk", 10000);
        Gerente gerente = new Gerente("Lucas", 20000);
        gerente.setBonus(500);
        JOptionPane.showMessageDialog(null, funcionario.getNome() + "\n Salário Calculado: " + funcionario.calcularSalario(15));
        JOptionPane.showMessageDialog(null, gerente.getNome() + "\n Salário Calculado: " + gerente.calcularSalario(15));


    }
}

package atividade11;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Lucas", 16000,20);
        System.out.println("Salário: "+funcionario.calcularSalarioLiquido());
    }
}

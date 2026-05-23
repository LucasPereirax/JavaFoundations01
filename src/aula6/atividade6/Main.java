package aula6.atividade6;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        funcionario.setNome("Joao");
        funcionario.setSalario(1000);

        gerente.setNome("Lucas");
        gerente.setSalario(2000);
        gerente.setBonus(500);

        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário Calculado: R$ " + funcionario.calcularSalario());
        System.out.println("---------------------------------");
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Salário Base: R$ " + gerente.getSalario());
        System.out.println("Bônus: R$ " + gerente.getBonus());
        System.out.println("Salário Calculado (com bônus): R$ " + gerente.calcularSalario());
    }
}

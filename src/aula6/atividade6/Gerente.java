package aula6.atividade6;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public Double calcularSalario(int diasTrabalhados) {
        return super.calcularSalario(diasTrabalhados)+bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

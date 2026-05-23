package aula6.atividade6;

public class Gerente extends Funcionario{
    private double bonus = 0;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

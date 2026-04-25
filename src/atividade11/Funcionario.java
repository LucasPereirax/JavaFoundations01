package atividade11;

import javax.swing.*;

public class Funcionario {
    String nome;
    double salarioBase;
    int horasExtras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBase;
    }

    public void setSalarioBruto(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Funcionario(String nome, double salarioBase, int horasExtras){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }
    public double calcularSalarioLiquido(){
        double salarioLiquido;
        double valorHoraExtra = (salarioBase/160)*0.20;
        double valorTotalHoraExtra = valorHoraExtra*horasExtras;
        double salarioBruto = salarioBase + valorTotalHoraExtra;

         if (salarioBruto > 3000){
             salarioLiquido = (salarioBruto*0.85);
         }else {
             salarioLiquido = (salarioBruto*0.925);
         }
        return salarioLiquido;

    }
}

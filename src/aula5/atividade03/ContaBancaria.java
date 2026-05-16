package aula5.atividade03;

import javax.swing.*;

public class ContaBancaria {

    private String titular;
    private String numero;
    private double saldo;

    public ContaBancaria(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if (valor >0){
            this.saldo += valor;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor){
        if (valor >0 && valor<saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void exibirExtrato(){
        JOptionPane.showMessageDialog(null,
                "Conta: " + this.numero + "\n" +
                        "Titular: " + this.titular + "\n" +
                        "Saldo: " + this.saldo
        );
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}

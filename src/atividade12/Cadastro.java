package atividade12;

import javax.swing.*;

public class Cadastro {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;
    String status;
    double media;


//    public Cadastro(int matricula, String nome, double nota1, double nota2, double nota3) {
//        this.matricula = matricula;
//        this.nome = nome;
//        this.nota1 = nota1;
//        this.nota2 = nota2;
//        this.nota3 = nota3;
//    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void entradaDados(){
        this.nome = JOptionPane.showInputDialog("Digite seu nome: ");
        this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua matrícula: "));
        this.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        this.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        this.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
    }

    public String calculaMedia(){
         media = (nota1+nota2+nota3)/3;

        if (media >= 7) {
            status = "Aprovado";
        } else if (media >=5 && media <7) {
            status = "Recuperação";
        }else{
            status = "Reprovado";
        }
        return status;
    }
    public String retorno(){
        String mediaFormatada = String.format("%.2f", media);
        boolean feedback = media >=7;
        return "Matricula: "+matricula+"\nNome: "+nome+"\nNota1: "+nota1+"\nNota2: "+nota2+"\nNota3: "+nota3+"\nMédia: "+mediaFormatada+"\nSituação Final: "+status+"\nFeedback: "+(feedback ? "Parabéns":"Estude mais");
    }
}

package atividade1;

import javax.swing.*;

public class Strings {

    public static void item1(){
        //comparação Strings
        String nome1 = "Lucas";
        String sobrenome1 = "Pereira de Oliveira";

        String nomeCompleto1 = nome1 + " " + sobrenome1;    //Daniel Campos Pereira
        String nomeCompleto2 = "Lucas Pereira de Oliveira";

        System.out.println(nomeCompleto1.equals(nomeCompleto2));

        //não fa\zer comm ==
        //System.out.println("Comparação com == : " + nome1 == nome2);


    }

    public static void item2(){
        //métodos STRING

       //String nome = JOptionPane.showInputDialog("Informe seu nome: ");

       //System.out.println("nome em MAIUSCULAS: "+ nome.toUpperCase());
       //System.out.println("nome em MINUSCULAS: "+ nome.toLowerCase());
       //System.out.println("Primeira letra do nome: "+ nome.charAt(0));
       //System.out.println("Quantidade de letras do nome: "+ nome.length());
       //System.out.println("Ultima letra do nome: "+ nome.charAt(nome.length()-1));

       //String primeiroNome = nome.substring(0, nome.indexOf(" "));
       //String SegundoNome = nome.substring(nome.indexOf(" "), nome.lastIndexOf(" "));
       //System.out.println("primeiro nome: " + primeiroNome);
       //System.out.println("segundo nome: " + SegundoNome);

        String idade1 = JOptionPane.showInputDialog("Informe sua idade: ");
        String idade2 = JOptionPane.showInputDialog("Informe sua idade: ");
        int soma = Integer.parseInt(idade1) + Integer.parseInt(idade2);

        System.out.println("idade somada: "+ soma);
    }

    public static void item3(){
        String num1 = JOptionPane.showInputDialog("Informe o primero numero: ");
        String num2 = JOptionPane.showInputDialog("Informe o segundo numero: ");

        double media =  (Double.valueOf(num1) + Double.parseDouble(num2))/2;

        System.out.println("Média: " + media);
    }

    public static void item4(){
        Integer numero1 = -128;
        Integer numero2 = -128;

        System.out.println(numero1==numero2);
    }

    public static void item5(){
        Integer numero1 = 900;

        numero1.toString();
        Integer.valueOf(numero1);

    }
}

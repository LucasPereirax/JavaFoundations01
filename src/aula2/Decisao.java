package aula2;

import javax.swing.*;

public class Decisao {
    public static void item1(){


        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: "));
        if (idade >= 65){
            System.out.println("Idoso");
        } else if (idade>=18 && idade < 64) {
            System.out.println("Adulto");
        } else if (idade >= 12 && idade < 17 ) {
            System.out.println("Adolescente");
        }else{
            System.out.println("Criança");
        }
    }

    public static void item2(){
        int diaDaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
        switch (diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Digite um valor numérico de 1 a 7");
        }

        //EXEMPLO DE SWITCH RETIRANDO O BREAK

        int nps = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua nota (1 à 5): "));

        switch(nps){
            case 1:
            case 2:
                System.out.println("Detrator");
                break;
            case 3:
                System.out.println("Neutro");
                break;
            case 4:
            case 5:
                System.out.println("Promotor");
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
        }
    }

    public static void item3(){
        int idade = 10;

        System.out.println( ((idade >= 18) ? "Maior" : "Menor") + " de idade" );
    }
}

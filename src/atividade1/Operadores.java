package atividade1;

import java.util.Scanner;

public class Operadores {
    
    public static void item1(){
        
        //Operadores aritimeticos (+ - * / %)
        
        int primeiroNumero = 10;
        int segundoNumero = 3;
        
        //SOMA
        int soma = primeiroNumero + segundoNumero;          //Resultado: 13
        int subtracao = primeiroNumero - segundoNumero;     //Resultado: 7
        int multiplicacao = primeiroNumero * segundoNumero; //Resultado: 30
        int divisao = primeiroNumero / segundoNumero;       //Resultado: 3
        int resto = primeiroNumero % segundoNumero;         //Resultado: 1
        
        //casting - Converter um tipo int para um tipo double
        double divisaoDecimal = (double) primeiroNumero / segundoNumero;
        
        System.out.println("NUMEROS: " + primeiroNumero + " e " + segundoNumero);
        System.out.println("SOMA: " + soma );
        System.out.println("SUBTRAÇÃO: " + subtracao );
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao );
        System.out.println("DIVISÃO: " + divisao + " (Inteiro)");
        System.out.println("DIVISÃO: " + divisaoDecimal + " (Decimal)");
        System.out.println("MODULO: " + resto );
        
    }
    
    public static void item2(){
        //Operadores relacionais (== != > < >= <=)

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = teclado.nextInt();

        System.out.println(num1 + " == " +num2 + ": " + simNao(num1 == num2) );
        System.out.println(num1 + " != " +num2 + ": " + simNao(num1 != num2) );
        System.out.println(num1 + " > " +num2 + ": " + simNao(num1 > num2) );
        System.out.println(num1 + " < " +num2 + ": " + simNao(num1 < num2) );
        System.out.println(num1 + " >= " +num2 + ": " + simNao(num1 >= num2) );
        System.out.println(num1 + " <= " +num2 + ": " + simNao(num1 <= num2) );

    }

    public static void item3(){
        //Operadores lógicos && || !=
        boolean maiorIdade = false;
        boolean temFilho = true;
        boolean temCursoSuperior = true;
        boolean temPosGraduacao = true;
        boolean temExperiencia = true;

        if (!maiorIdade){
            System.out.println("Esta bloqueado");
        }

        if (temCursoSuperior || temExperiencia || !temPosGraduacao){
            System.out.println("Esta apto para dev Junior");
        }

        if (temCursoSuperior && temExperiencia){
            System.out.println("Esta apto para dev Pleno");
        }

        if (temCursoSuperior && temExperiencia && temPosGraduacao){
            System.out.println("Esta apto para dev Senior");
        }
    }

    public static void item4(){
        //Operadores de incremento e decremento (++ / --)
        int contador = 0;
        contador++;
        contador++;
        contador++;

        System.out.println("contador: "+ contador);

        int indice = 30;
        int indiceAnterior = indice++;
        System.out.println("indice: " + indice);
        System.out.println("indiceAnterior: "+ indiceAnterior);

        //pré incremento
        int novoIndice = ++indice;
        System.out.println("indice: " + indice);
        System.out.println("Novo indice: " + novoIndice);
    }

    public static void item5(){
        //operadores de atribuição (=,+=,-=,*=,/=,%=)
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        System.out.println("Escreva um número: ");
        num1 = scanner.nextInt();

        System.out.println("Escreva outro número: ");
        num2 = scanner.nextInt();

        num1 += num2;
        System.out.println("num1 += num2");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);


        num1 -= num2;
        System.out.println("num1 -= num2");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        num1 *= num2;
        System.out.println("num1 *= num2");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        num1 /= num2;
        System.out.println("num1 /= num2");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        num1 %= num2;
        System.out.println("num1 %= num2");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        scanner.close();
    }
    
    static String simNao(boolean valor){
     String resultado = valor ? "Sim": "Não";
     return resultado;
    }
    
}

package atividade24;


import java.util.Scanner;

public class Atividade24 {
    static String[][] tabuleiro = new String[3][3];
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean finalDoJogo = false;

        String jogadorAtual = "O";


        for (int i = 0; i < 3; i++){
                for (int x = 0;x<3; x++){
                    tabuleiro[i][x] = " ";
                }
        }

        while(!finalDoJogo){

            //Receber a jogada do jogador.
            System.out.println("É a vez do jogador " + jogadorAtual);
            System.out.print("Informe a linha (1-3): ");
            int linhaJogada = scanner.nextInt()-1;
            System.out.print("Informe a coluna (1-3): ");
            int colunaJogada = scanner.nextInt()-1;

            if(tabuleiro[linhaJogada][colunaJogada].equals(" ")){
                tabuleiro[linhaJogada][colunaJogada] = jogadorAtual;
                jogadorAtual = jogadorAtual.equals("O") ? "X":"O";

            }
            else {
                System.err.println("Jogada inválida, tente novamente");
            }

            mostrarTabuleiro();
            if (verificarVitoria()){
                jogadorAtual = jogadorAtual.equals("X") ? "O":"X";
                System.out.println("O jogador " + jogadorAtual + " venceu!");
                finalDoJogo = verificarVitoria();
            }
            else if(verificarEmpate()){
                System.out.println("O jogo empatou!");
                finalDoJogo = verificarEmpate();
            }
        }
    }
    public static void  mostrarTabuleiro(){
        for (int i = 0; i < 3; i++){
            System.out.print("|");
            for (int x = 0;x<3; x++){
                System.out.print(tabuleiro[i][x]);
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    public static boolean verificarVitoria(){
        for (int i=0; i<3; i++){
            if(!tabuleiro[i][0].equals(" ")){
                if(tabuleiro[i][0].equals(tabuleiro[i][1])){
                    if(tabuleiro[i][0].equals(tabuleiro[i][2])){
                        return true;
                    }
                }
            }
            if(!tabuleiro[0][i].equals(" ")){
                if(tabuleiro[0][i].equals(tabuleiro[1][i])){
                    if(tabuleiro[0][i].equals(tabuleiro[2][i])){
                        return true;
                    }
                }
            }
            //falta diagonal
        }
        return false;
    }

    public static boolean verificarEmpate(){
        for (int i = 0; i < 3; i++){
            for (int x = 0;x<3; x++){
                if (tabuleiro[i][x].equals(" ")){
                    return false;
                }
            }
        }
        return true;
    }
}

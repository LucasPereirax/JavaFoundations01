package atividade1a9;

import javax.swing.*;

public class atv04 {
    public static void main(String[] args) {
        int pontuacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a pontuação: "));
        if (pontuacao < 60){
            System.out.println("Repetir treinamento na floresta");
        } else if (pontuacao >=60 && pontuacao <70) {
            System.out.println("Aprendiz de Trilha");
        } else if (pontuacao >=70 && pontuacao <80) {
            System.out.println("Batedor(a) do Mapa");
        } else if (pontuacao >=80 && pontuacao <90) {
            System.out.println("Caçador(a) de Tesouros");
        }else{
            System.out.println("Guardião da Relíquia");
        }
    }
}

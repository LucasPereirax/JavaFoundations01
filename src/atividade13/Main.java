package atividade13;

import javax.swing.*;
import java.net.Inet4Address;

public class Main {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do array"));
        String[] lista = new String[tamanho];

            for (int i = 0; i < lista.length; i++){
                String nomes = JOptionPane.showInputDialog("Digite o nome: ");
                lista[i] = nomes;
            }
        for (int i=0; i<lista.length;i++){
            System.out.println((i+1)+". "+lista[i]);
        }
    }
}

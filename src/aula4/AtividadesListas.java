package aula4;

import javax.swing.*;
import java.util.ArrayList;

public class AtividadesListas {
    public static void atividade1(){
        ArrayList<Integer> numeros = new ArrayList<>();
        while (true) {
            String valores = JOptionPane.showInputDialog("Digite os valores maior que 0: ");
            int convert = Integer.parseInt(valores);
            if (convert == 0 || valores.equals("parar") || valores.equals(" ")){
                break;
            }
            if (convert%2 ==0){
                numeros.add(convert);
            }
        }
        System.out.println(numeros);
    }

    public static void atividade2(){
        ArrayList<String> listaNomes = new ArrayList<>();
        while (true) {
            String nomes = JOptionPane.showInputDialog("Digite os nomes: ");
//            int convert = Integer.parseInt(nomes);
            if (nomes.equals("0")){
                break;
            }
            if (!listaNomes.contains(nomes)){
                listaNomes.add(nomes);
            }else {
                JOptionPane.showMessageDialog(null, "Nome já havia sido adicionado anteriormente");

            }
        }
        System.out.println(listaNomes);
    }

    public static void atividade3(){
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número para a lista:"));
            listaNumeros.add(num);
        }

        int indice = Integer.parseInt(JOptionPane.showInputDialog("Lista atual: " + listaNumeros +
                "\nDigite a posição (índice) que deseja alterar:"));

        if (indice >= 0 && indice < listaNumeros.size()) {

            int novoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo valor para a posição " + indice + ":"));
            listaNumeros.set(indice-1, novoValor);

            JOptionPane.showMessageDialog(null, "Valor atualizado com sucesso!\nLista final: " + listaNumeros);
        } else {
            JOptionPane.showMessageDialog(null, "Erro: A posição " + indice + " não existe na lista.");
        }

        System.out.println("Lista final no console: " + listaNumeros);
    }

    public static void atividade4(){

    }

}

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
        ArrayList<Integer> numeros = new ArrayList<>();

        while(true){
            String entradaStr = JOptionPane.showInputDialog("Informe um número: ");
            if (entradaStr == null){
                break;
            }
            Integer entradaInt = Integer.parseInt(entradaStr);
            numeros.add(entradaInt);
        }

        JOptionPane.showMessageDialog(null, numeros);

        int numeroAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero a ser substituido: "));
        int novoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo valor: "));

        int indice = numeros.indexOf(numeroAtual);

        if(indice >=0 && indice <= numeros.size()-1){
            numeros.set(indice, novoValor);
        }

        JOptionPane.showMessageDialog(null, numeros);
    }

    public static void atividade4(){
        ArrayList<String> nomes = new ArrayList<>();

        //Recebe pelo menos 5 nomes do usuario, até ele decidir parar.
        while(true){
            String entrada = JOptionPane.showInputDialog("Informe um nome: ");
            if (entrada == null){
                if(nomes.size()>=5){
                    break;
                }
                else{
                    int faltam = 5 - nomes.size();
                    JOptionPane.showMessageDialog(null, "Informe pelo menos 5 nomes, faltam "+faltam);
                }
            }else{
                nomes.add(entrada);
            }
        }
        JOptionPane.showMessageDialog(null,"A lista tem um tamanho de "+nomes.size());
        JOptionPane.showMessageDialog(null,"O primeiro nome é: "+nomes.get(0)+", O último é: "+nomes.get((nomes.size()-1)));

        String novoNome = JOptionPane.showInputDialog("Digite um novo nome para a segunda posição: ");
        nomes.set(1,novoNome);
        String removeNome = JOptionPane.showInputDialog("A lista é "+nomes+". Informe um nome para remover: ");
        boolean conseguiu = nomes.remove(removeNome);
        if (conseguiu){
            JOptionPane.showMessageDialog(null,"Operação realizada com sucesso! nome: "+removeNome+" removido com sucesso! nova lista: "+nomes);
        }else{
            JOptionPane.showMessageDialog(null,"Operação falhou! nome: "+removeNome+" não foi removido! lista: "+nomes);
        }

        String nomeVerificar = JOptionPane.showInputDialog("Escolha outro nome: ");

        if (nomes.contains(nomeVerificar)){
            JOptionPane.showMessageDialog(null,"A lista final é: "+nomes);
        }else{
            JOptionPane.showMessageDialog(null,"Nome escolhido não existe na lista! A lista final é: "+nomes);
        }

    }

    public static void atividade5(){

        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Double> notasAprovadas = new ArrayList<>();

        while(true){
            String notaStr = JOptionPane.showInputDialog("Informe a nota" + (notas.size()+1) + ": ");
            if (notaStr == null){
                break;
            }
            Double notaDouble = Double.parseDouble(notaStr);
            notas.add(notaDouble);

            if(notaDouble >= 7){
                notasAprovadas.add(notaDouble);
            }
        }

        double soma = 0.0;
        double maiorNota = notas.get(0);
        double menorNota = notas.get(0);

        for(int i = 0; i < notas.size(); i++){

            soma += notas.get(i);

            if (notas.get(i) > maiorNota){
                maiorNota = notas.get(i);
            }
            if (notas.get(i) < menorNota){
                menorNota = notas.get(i);
            }
        }

        double media = soma/notas.size();

        String mediaStr = String.format("%.1f", media);

        JOptionPane.showMessageDialog(null,
                "A média das notas é: " + mediaStr + "\n" +
                        "Maior nota: " + maiorNota + "\n" +
                        "Menor nota: " + menorNota + "\n" +
                        "Notas aprovadas: " + notasAprovadas
        );


    }

}

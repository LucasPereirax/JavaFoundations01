package aula8.agregacao;

public class Tecnico {
    String nome;
    String nacionalidade;
    int idade;
    int titulosDeCopa;

    void apresentacao(){
        System.out.println("Nome: " + nome +"\n"
                + "Nacionalidade: " + nacionalidade + "\n"
                + "Idade: " + idade + "\n"
                + "Títulos de Copa: " + titulosDeCopa);
    }
}

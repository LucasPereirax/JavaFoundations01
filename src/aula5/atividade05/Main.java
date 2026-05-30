package aula5.atividade05;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Toto",10,"Labrador");

        Gato gato = new Gato("kkkk",2);
        gato.nome = "Sig";
        gato.idade = 5;

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(cachorro);
        animais.add(gato);
        animais.add(new Cachorro("Thunder",7,"Poodle"));
        animais.add(new Gato("Teste",2));
        animais.add(new Capivara("Teste0",10));

        for (Animal animal : animais) {
            animal.emitirSom();
        }


    }

}
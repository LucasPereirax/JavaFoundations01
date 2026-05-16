package aula5.atividade05;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Golden");
        Gato gato  = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();
    }
}

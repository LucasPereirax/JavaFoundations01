package aula8.composicao;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Gol";
        carro.anoFabricacao = 2015;
        carro.valor = 50000;
        carro.motor.potencia = 100;
        carro.motor.anoFabricacao = 2015;

        Carro carro2 = new Carro(2026, "Tiguan", 200000,200);

    }
}

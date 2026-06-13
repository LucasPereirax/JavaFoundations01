package aula8.composicao;

public class Carro {
    String modelo;
    int anoFabricacao;
    double valor;
    Motor motor;

    public Carro() {}

    public Carro(int anoFabricacao, String modelo, double valor, int potencia) {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.motor = new Motor(anoFabricacao, potencia);
        this.valor = valor;
    }
}

package atividade10;

public class loja {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Notebook", 3500, 4);
        Produtos produto2 = new Produtos("Monitor", 500, 4);

        produto1.exibirInfo();
        produto2.exibirInfo();

    }
}

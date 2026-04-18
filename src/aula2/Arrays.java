package aula2;

public class Arrays {
    public static void item1(){
        int[] pedras = {1,20,22,56,58,60};
        String cores[] = {"Vermelho", "Preto", "Branco"};

        System.out.println(pedras[1]);

        //Alterando um elemento do Array
        cores[0] = "Azul";
        System.out.println(cores[0]);
        System.out.println(cores[1]);
        System.out.println(cores[2]);
    }

    public static void item2(){
        //Declarando um Array sem inicializar

        String[] passageiros = new String[5];

        passageiros[0] = "Daniel";
        passageiros[1] = "Maria";
        passageiros[2] = "Jose";
        passageiros[3] = "Sebastião";
        passageiros[4] = "Adroaldo";
    }


    public static void item3(){
        String[][] quadro = {{"vazio","vazio","vazio"}, {"vazio","vazio","vazio"}, {"vazio","vazio","vazio"}};

        quadro[0][0] = "x";

        System.out.println(quadro);
    }
}

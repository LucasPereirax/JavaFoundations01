package aula3;

public class Repeticao {
    public static void item1() {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    public static void item2(){
        int[] numerosMegaSena = new int[6];
        for (int i = 0; i < 6; i++){
            numerosMegaSena[i] = (int)(Math.random()*60)+1;
            System.out.println(numerosMegaSena[i]);
        }
    }

    public static void item3(){
        String[] alunos = {"João","Maria","Pedro","Ana"};
        for(String e: alunos){
            System.out.println("Olá "+ e);
        }
    }

    public static void item4(){
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }
    }
}

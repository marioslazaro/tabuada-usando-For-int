import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Qual valor deseja multiplicar?");
        int tabuada;
        int valor;

        tabuada = scan.nextInt();
        System.out.println("Ate quanto deseja multiplicar? ");

        valor = scan.nextInt();
        System.out.println();

        for (int i = 0; i <= valor ; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));

        }



    }
}
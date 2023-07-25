import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada: ");
        int tabuada;

        tabuada = scan.nextInt();
        System.out.println("Tabuada de: ");

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));

        }



    }
}
package estruturasControle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String valor;

        do{
            System.out.println("Diga as palavras magicas ! ! !\n");
            System.out.println("Quer sair");
            valor = scanner.nextLine();
        }while(!valor.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado");

        scanner.close();

    }
}

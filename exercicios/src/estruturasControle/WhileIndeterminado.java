package estruturasControle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String valor = "";

        //QUANTIDADE INDETERMINDA DE REPETIÇÕES
        while(!valor.equalsIgnoreCase("sair")){
            System.out.println("Voce diz: ");
            valor = scanner.next();
        }
        scanner.close();

    }
}

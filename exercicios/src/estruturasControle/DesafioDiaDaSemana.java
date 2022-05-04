package estruturasControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        String valor = scanner.next();

        if(valor.equalsIgnoreCase("domingo")){
            System.out.println("Dia 1 da semana");
        }else if("segunda".equalsIgnoreCase(valor)){
            System.out.println("Dia 2 da semana");
        }else if("terça".equalsIgnoreCase(valor) || "terca".equalsIgnoreCase(valor)){
            System.out.println("Dia 3 da semana");
        }else if("quarta".equalsIgnoreCase(valor)){
            System.out.println("Dia 4 da semana");
        }else if("quinta".equalsIgnoreCase(valor)){
            System.out.println("Dia 5 da semana");
        }else if("sexta".equalsIgnoreCase(valor)){
            System.out.println("Dia 6 da semana");
        }else if("sabado".equalsIgnoreCase(valor) || "sábado".equalsIgnoreCase(valor)){
            System.out.println("Dia 7 da semana");
        }else{
            System.out.println("Dia inválido");
        }

        scanner.close();
    }
}

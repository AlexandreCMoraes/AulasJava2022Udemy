package fundamentos3;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        //FORMULA DE CONVERSAO
        //(°F - 32) * 5/9 = °C

        //LEITURA DE DADOS
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a temperatura em Fahrenheit");

        double entrada = Integer.parseInt(scanner.nextLine());;
        final double temp = 32;
        final double temp2 = 5.0/9.0;

        double cel = (entrada-temp)*temp2;

        System.out.println("A temperatura convertida é: " + cel + "°Celsius");

    }
}

package fundamentos;

import java.util.Scanner;

public class DesafioModuloCalculadoraSolo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular? Digite o primeiro número");
        double entrada1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número agora");
        double entrada2 = Integer.parseInt(scanner.nextLine());

//        System.out.println("Agora digite a operação desejada: + , - , / , *");
        System.out.println("Agora digite a operação desejada: + , - , / , * , %");
        String operacao = scanner.next();

//        boolean soma =  operacao.equals("+");
//        var resultado = entrada1 + operacao + entrada2;

        double resultado = "+".equals(operacao) ? entrada1 + entrada2 : 0;
        resultado = "-".equals(operacao) ? entrada1 - entrada2 : resultado;
        resultado = "*".equals(operacao) ? entrada1 * entrada2 : resultado;
        resultado = "/".equals(operacao) ? entrada1 / entrada2 : resultado;
        resultado = "%".equals(operacao) ? entrada1 % entrada2 : resultado;

        System.out.println(entrada1 + " " +  operacao + " "  + entrada2 + " = "+
                resultado + " Calculo feito");

        System.out.printf("%.2f %s %.2f = %.2f", entrada1, operacao, entrada2, resultado);

        scanner.close();

    }
}

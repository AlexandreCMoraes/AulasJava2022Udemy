package fundamentos3;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        //IMPRIME NA MESMA LINHA
        System.out.print("Bom");
        System.out.print(" Dia\n");

        //IMPRIME NA PROXIMA LINHA
        System.out.println("BOM");
        System.out.println("DIA");

        //IMPRIME STRING FORMATADA
        System.out.printf("Mega sena: %d %d %d %d %d %d \n", 1,2,3,4,5,6);

        //ARREDONDA VALOR
        System.out.printf("Salario: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "joao");

        //SAIDA DO SISTEMA, LEITURA DE DADOS
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        //ESPERA USUARIO DIGITAR INFO
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome ");
        //ESPERA USUARIO DIGITAR INFO
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua idade ");
        //ESPERA USUARIO DIGITAR INFO
        int idade = entrada.nextInt();

        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.printf("Seu nome é: %s %s e voce tem %d anos", nome, sobrenome, idade);

        //FECHAMENTO DE SCANNER
        entrada.close();

    }

}

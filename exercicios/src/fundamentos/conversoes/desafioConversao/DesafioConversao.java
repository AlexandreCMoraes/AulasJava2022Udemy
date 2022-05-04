package fundamentos.conversoes.desafioConversao;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //PEGAR DADOS
        System.out.println("Informe seu primeiro salário: ");
        String valor1 =  entrada.next().replace(",", "."); //SUBSTITUIR UM DADO POR OUTRO

        System.out.println("Informe seu segundo salário: ");
        String valor2 =  entrada.next().replace(",", "."); //SUBSTITUIR UM DADO POR OUTRO

        System.out.println("Informe seu terceiro salário: ");
        String valor3 =  entrada.next().replace(",", "."); //SUBSTITUIR UM DADO POR OUTRO

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);
        double mediaSalario =  (salario1 + salario2 + salario3) / 3;

        System.out.println("A média dos salários é: " + mediaSalario);


        entrada.close();
    }
}

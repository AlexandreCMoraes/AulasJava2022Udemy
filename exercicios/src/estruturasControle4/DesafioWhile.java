package estruturasControle4;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int qtdNotas = 0;
        double nota = 0;
        double total = 0;

        System.out.println("Informe a nota do aluno ou digite -1 p/ sair");

        //ENQUATO NOTA FOR DIFERENTE DE -1, CONTINUA NO WHILE, SE FOR IGUAL, FAZ AS CONTAS
        while(nota != -1){
            System.out.print("Informe a nota: ");
            nota =  scanner.nextDouble();

            //FEITO IF POIS SENAO QND DIGITA -1, ENTRA-SE COMO NOTA VALIDA E NAS CONTAS DA MEDIA
            if(nota <= 10 && nota >= 0){
                total += nota;
                qtdNotas++;
            }else if(nota != -1){
                System.out.println("Nota invalida");
            }
        }

        double mediaTotal = total /qtdNotas;
        System.out.println("Média total: " + mediaTotal +
                "\nTotal de notas: " + qtdNotas +
                "\nSoma das notas: " + total +
                "\nTotal de alunos: " + qtdNotas);

        scanner.close();
    }
}

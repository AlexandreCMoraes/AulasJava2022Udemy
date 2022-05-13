package arraysCollections6.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioNota {

    public static void main(String[] args) {

        //PEGAR INFO NO CONSOLE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas deseja informar");
        int notasInformada = scanner.nextInt();

        // CRIAR ARRAY E COLOCAR O DADO DENTRO INFORMANDO O TAMANHO DO ARRAY
        double[] notas = new double[notasInformada];

        // FAZENDO ITERAÇÃO E COLOCANDO AS NOTAS DENTRO DE CADA INDICE
        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota " + (i + 1) + " -> "); // FEITO P/ PEGAR O INDICE '0' E SOMAR COM '1'
            // MOSTRANDO A QTD DE NOTAS
            notas[i] = scanner.nextDouble(); // ADD NOTA NA POSIÇÃO 'I' E ASSIM POR DIANTE
        }
        System.out.println("Mostrando todas as notas adicionadas\n" + Arrays.toString(notas));
        //System.out.println("Soma de todas as notas -> " + );

        //PERCORRER OS ELEMENTOS E ADD NA VAR 'totalNotas'
        double totalNotas = 0;
        for(double nota : notas) {
            totalNotas += nota;
        }
        System.out.println("Soma de todas as notas -> " + totalNotas);
        System.out.println("A média das notas é -> " + totalNotas / notas.length);

        scanner.close();
    }
}

package arraysCollections6.arrays;

import java.util.Arrays;

public class Exercicios {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];// <-QTD DE ITENS
        // COLOCANDO VALORES NO INDICES
        notasAlunoA [0] = 7.9;
        notasAlunoA [1] = 8;
        notasAlunoA [2] = 6.6;

        System.out.println("Notas do alunoA -> " + Arrays.toString(notasAlunoA)); //IMPRIMIR TODAS AS NOTAS

        //FAZENDO "FOR" PARA NAVEGAR NO ARRAY
        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println("Média do alunoA -> " + totalAlunoA / 3); // PODE SER FEITO DESTA FORMA
        System.out.println("Média do alunoA -> " + totalAlunoA / notasAlunoA.length); // DESTA FORMA MELHOR POIS JA
        // PEGA O TAMANHO DIRETO DO ARRAY
        System.out.println("Uma nota do alunoA -> " + notasAlunoA[1]);
        System.out.println("Ultima nota do alunoA -> " + notasAlunoA[notasAlunoA.length - 1]);

        final double notaArm = 5; //CONSTANTE
        // OUTRA FORMA DE INICIALIZAR ARRAY
        double[] notasAlunoB = { 6.9, 8.9, notaArm, 9 }; // MESMO VALOR INT É CONVERTIDO P/ DOUBLE  E TBM MENOS COMUM AO
        // USAR ESSA FORMA DE INICIALIZAR UM ARRAY
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println("\nMédia do alunoB -> " + totalAlunoB / notasAlunoB.length);
    }
}

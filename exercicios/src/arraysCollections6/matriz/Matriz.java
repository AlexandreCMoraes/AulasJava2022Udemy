package arraysCollections6.matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        //PEGAR DADOS INSERIDOS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com  a quantidade de alunos");
        int qtdAlunos = scanner.nextInt();

        System.out.println("Entre com  a quantidade de notas por aluno");
        int qtdNotas = scanner.nextInt();

        //CRIANDO MATRIZ PARA COLOCAR QTD DE ALUNOS E QTD DE NOTAS
        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        // ITERANDO UM FOR DENTRO DE OUTRO E ADD QTD DE ALUNO -> E QTD DE NOTAS
        double total = 0;//ADD AS NOTAS AQUI
        for (int a = 0; a < notasDaTurma.length; a++){
            for (int n = 0; n < notasDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d -> ", n + 1, a + 1);// MOSTRAR NUM EM SEQUENCIA P/
                // NÃO FICAR CONFUSO
                notasDaTurma[a][n] = scanner.nextDouble();//
                total += notasDaTurma[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Total das notas -> " + total);
        System.out.println("Média da turma é -> " + media);

        scanner.close();
    }
}

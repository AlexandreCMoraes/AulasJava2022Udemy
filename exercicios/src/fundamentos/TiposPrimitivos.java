package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //INFORMAÇÕES DO FUNCIONÁRIO

        //TIPOS NUMÉRICOS INTEIROS
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        //literal long e nao inteiro pois passa de int
        long pontosAcumulados = 3_234_845_223L;

        //TIPOS NUMÉRCIOS REAIS
        //deixa claro que é float pois esta no tamanho de double
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //TIPO BOOLEANO
        boolean estaDeFerias = false;

        //TIPO CARACTERE
        //aspas simples '' e nao duplas ""
        char status = 'a';

        //DIAS DE EMPRESA
        System.out.println(anosDeEmpresa * 365);

        //NUMEROS DE VIAGEM
        System.out.println(numeroDeVoos / 2);

        //PONTOS POR REAL
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + " ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status " + status);

    }
}

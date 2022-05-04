package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        //BYTE
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; //int PRIMITIVO
        Integer conversor =  Integer.parseInt("10500"); //CONVERTER STRING P/ VALOR INTEIRO
        //CONVERTER P/ PRIMITIVO APENAS TROCA O Long POR long
        Long l =  100000L;

        //SCANNER
        Integer novo =  Integer.parseInt(entrada.next()); //CONVERTE PRA VALOR NUMERICO (ENTRADA.NEXT() PEGA STRING)

        System.out.println(b.byteValue()); //PEGA O VALOR
        System.out.println(s.toString()); //CONVERTE P/ STRING
        System.out.println(conversor);
        System.out.println(novo * 2); //MOSTRA A CONVERSAO DE STRING P/ VALOR
        System.out.println(l / 3);

        //TIPOS FLUTUANTES
        Float f = 123.10f;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        //VALORES BOOLEAN
        Boolean bo =  Boolean.parseBoolean("true"); //RETORNA VALOR BOOLEANO
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase()); //CONVERTE PRA STRING E DEPOIS UPPER

        Character c =  '#'; //ASPAS SIMPLES char
        System.out.println(c + "...");


        entrada.close();

    }
}

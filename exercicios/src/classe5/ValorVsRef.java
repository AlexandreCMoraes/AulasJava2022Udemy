package classe5;

import classe5.desafioDataConstrutor.Data;

public class ValorVsRef {

    public static void main(String[] args) {

        double a = 2;
        double b = a; //ATRIBUIÇÃO POR VALOR (PRIMITIVO)

        a++;
        b--;

        System.out.println(a + "  " + b);

        Data d10 = new Data(1, "Março", 2020);
        Data d20 = d10; //ATRIBUIÇÃO POR REFERENCIA (OBJ)

        d10.dia = 31;
        d20.mes = "Abril"; //A PRIORE NAO FUNCIONOU POIS NA CLASSE DATA, ESSAS REF NÃO TINHAM PUBLIC

        System.out.println(d10.obterDataFormat());
        System.out.println(d20.obterDataFormat());

        //voltarDataParaValorPadrao(d1); TODO nao deu certo static void voltarDataParaValorPadrao
        //System.out.println(d10.obterDataFormat());
        //System.out.println(d20.obterDataFormat());

        //int c = 5; TODO nao deu certo static void alterarPrimitivo
        //alterarPrimitivo(c);
        //System.out.println(c);

        /*
        static void voltarDataParaValorPadrao(Data d){ //PASSANDO OBJ PARA UM PARAMETRO DE UM METODO
            d.dia = 11;
            d.mes = "Julho";
            d.ano = 1988;
        }
        */

        /*
        static void alterarPrimitivo(int a){
            a++;
        }
         */
    }
}

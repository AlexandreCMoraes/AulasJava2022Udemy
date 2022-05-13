package classe5;

public class ValorNulo {

    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!"));

        /*
        Data d1 = null;
        d1.mes = 3; //DA ERRO POIS NÃO APONTA P/ UM OBJETO EXISTENTE
        */

        //String s2;
        String s2 = null;
        System.out.println(s2.concat("???")); //DA ERRO POIS NAO FOI INICIALIZADA String s2 = null;

    }
}

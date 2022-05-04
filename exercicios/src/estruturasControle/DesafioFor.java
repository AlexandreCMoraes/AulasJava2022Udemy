package estruturasControle;

public class DesafioFor {

    public static void main(String[] args) {

        String valor =  "#";
        for (int i = 1; i <= 5; i++){
            System.out.println(valor);
            valor += "#";
        }

        //VERSAO DESAFIO
        //NAO PODE USAR VALOR NUMERICO P/ CONTROLAR O LAÇO

        System.out.println("DESAFIO FEITO");
        for(String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}

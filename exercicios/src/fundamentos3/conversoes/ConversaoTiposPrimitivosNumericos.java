package fundamentos3.conversoes;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; //CONVERSAO SIMPLES DE INT PARA DOUBLE (IMPLICITA)
        System.out.println(a);

        float b = (float) 1.022555588888888; //TIPO DOUBLE CONVERTIDO P/FLOAT (EXPLICITA CAST )(pode ser feito float b
        // = 1
        // .0F;)
        System.out.println(b); //VALORES MUITO ALTOS NAO É SUPORTADO E GERA PERDA DE VALOR

        int c = 4;
        byte d = (byte)c; //FEITO DESTA FORMA DA ERRO POIS JAVA ANALISA ANALISA TAMANHO (EXPLICITA CAST)(byte d = c;)
        System.out.println(d);

        double e = 1.99999;
        int f = (int)e; //FUNCIONA MAS TRAZ SOMENTE O VALOR 1 POR CAUSA DA CONVERSAO (EXPLICITA CAST)
        System.out.println(f);

    }
}

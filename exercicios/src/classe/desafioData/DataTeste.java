package classe.desafioData;

public class DataTeste {

    public static void main(String[] args) {

        //PRIMEIRA INSTANCIA E SEUS ATRIBUTOS
        Data d1 = new Data(); //CONTRUTOR PADRAO SEM PARAMETRO
        d1.dia =  1;
        d1.mes = "Outubro";
        d1.ano = 1992;
        String DataNova = d1.obterData();

        //SEGUNDA INSTANCIA E SEUS ATRIBUTOS
        var d2 = new Data(); //CONTRUTOR PADRAO SEM PARAMETRO
        d2.dia =  15;
        d2.mes = "Janeiro";
        d2.ano = 1995;

        // System.out.printf("Dia %d de %s de %d", d1.dia, d1.mes, d1.ano);
        // System.out.printf("\nDia %d de %s de %d", d2.dia, d2.mes, d2.ano);
        System.out.println(DataNova);
        System.out.println(d2.obterData());
    }

}

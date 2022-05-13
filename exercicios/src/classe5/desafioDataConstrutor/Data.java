package classe5.desafioDataConstrutor;

public class Data {

    public int dia;
    public String mes;
    public int ano;

    Data(){
        /*
        dia =  1;
        mes = "Janeiro";
        ano = 1970;
         */
        this(1, "Dezembro", 1988); // THIS COMO FUNÇÃO(MÉTODO) DENTRO DE CONSTRUCTOR E SOMENTE
    }
    /*
    public Data(int dia1, String mes1, int ano1){
        dia = dia1;
        mes = mes1;
        ano = ano1;
    }
    */

    public Data(int dia, String mes, int ano){ //REFERENCIAR INSTANCIA
        this.dia = dia; // PARAMETRO RECEBE VARIAVEL DE INSTANCIA
        this.mes = mes;
        this.ano = ano;
    }

    public String obterDataFormat(){
        return String.format("Dia %d de %s de %d", this.dia, mes, ano);
    }

    //EXEMPLO DE VARIAVEL LOCAL
    /*
    public String obterDataFormat(){
        Final String formato = "Dia %d de %s de %d"; // VARIAVEL LOCAL VALIDO SOMENTE AQUI(SENÃO COLOQUE FORA E SERÁ
        ACESSADO POR OUTROS METODOS)
        return String.format(formato, this.dia, mes, ano);
    }
     */
}

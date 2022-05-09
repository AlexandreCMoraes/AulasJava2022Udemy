package classe.desafioData;

public class Data {

    int dia;
    String mes;
    int ano;

    String obterData(){
        return String.format("Dia %d de %s de %d", dia, mes, ano);
    }
}

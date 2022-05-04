package fundamentos.conversoes;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        Integer num1 = 10000;
        System.out.println(num1.toString().length()); //CONVERSAO FEITA A PARTIR DA VARIAVEL

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());//DEFININDO O OBJETO DE INT PODE SER FEITO A CONVERSAO
        System.out.println((" " + num2).length()); //CONVERTENDO USANDO CONCATENACAO COM "+"



    }
}

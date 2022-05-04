package fundamentos.operadores.desafioLogico;

public class DesafioLogico {

    public static void main(String[] args) {

        //TRABALHO NA TERCA (V OU F)
        //TRABALHO NA QUINTA (V U F)

        boolean trab1 = true;
        boolean trab2 = true;

        boolean TV32 = trab1 ^ trab2;
        boolean TV50 = trab1 && trab2;
        boolean temSorvete = trab1 || trab2;

        System.out.println("Comprou Tv de 32 Polegadas\"?" + TV32);
        System.out.println("Comprou Tv de 32 Polegadas e sorvete\"?" + TV32);
        System.out.println("Comprou Tv 50 Polegadas\"?"+ TV50);
        System.out.println("Nao vai comer nada\"?"+ !temSorvete);

    }
}

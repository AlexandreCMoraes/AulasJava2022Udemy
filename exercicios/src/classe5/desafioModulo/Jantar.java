package classe5.desafioModulo;

public class Jantar {

    public static void main(String[] args) {

        Comida dieta1 = new Comida("Feijão", 0.350); //CONSTRUCTOR DE COMIDA
        Comida dieta2 = new Comida("Arroz", 0.250); //CONSTRUCTOR DE COMIDA

        Pessoa dado1 = new Pessoa("Ale", 75.0); //CONSTRUCTOR DE PESSOA

        System.out.println("Sem comer nada -> " + dado1.dadosPessoa());
        dado1.Comer(dieta1);
        System.out.println("Comendo só feijão -> " + dado1.dadosPessoa());
        dado1.Comer(dieta2);
        System.out.println("Comendo arroz e feijão -> " + dado1.dadosPessoa());

    }
}

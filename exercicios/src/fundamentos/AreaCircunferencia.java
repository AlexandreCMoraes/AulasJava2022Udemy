package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {

        double Raio = 3.4;
        //VALOR NAO PODE MUDAR MAIS COM FINAL
        final double Pi = 3.14159;

        double area = Pi * Raio * Raio;

        System.out.println("Primeiro valor " + area);

        Raio = 10;
        area = Pi * Raio * Raio;
        System.out.println("O valor agora é " + area);
        System.out.println(2+5);

    }
}

package estruturasControle;

public class Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.println("fim do continue");

        //IMPRIME OS VALORES DE 1 ATE 4, QND CHEGA NO 5 PULA E CONTINUA CONTANDO
        for (int i = 0; i <= 10; i++) {

            if (i == 5) continue;
            System.out.print(i +", ");
        }
        System.out.println("fim");
    }
}

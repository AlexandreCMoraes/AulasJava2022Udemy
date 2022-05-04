package estruturasControle;

public class For3 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("\nOutro for dentro de for\n");
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf(" [%d - %d] ", i, j);
            }
            System.out.println();
        }

    }
}

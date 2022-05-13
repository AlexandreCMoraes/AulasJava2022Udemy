package estruturasControle4;

public class BreakRotulado {

    public static void main(String[] args) {

        externo: for (int i = 0; i < 4; i++){
            System.out.println("for externo");
            for (int j = 0; j < 3; j++){
                if (i == 1){
                    break externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim");
    }
}

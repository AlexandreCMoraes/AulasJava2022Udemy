package fundamentos3.operadores.desafioAritmetico;

public class DesafioAritmeticoSolo {

    public static void main(String[] args) {
    //PRIMEIRA EXPRESSAO
    int conta1 =  6 * (3 + 2);
    double contaPow1 =  Math.pow(conta1, 2);
    double conta1DivFim =  contaPow1 / (3 * 2);

    //SEGUNDA EXPRESSAO
    int conta2 =  (1 - 5) * (2 - 7);
    double conta2Div = conta2 / 2D;
    double contaPow2Fim = Math.pow(conta2Div, 2);

    //TERCEIRA EXPRESSAO
        double conta3 = conta1DivFim - contaPow2Fim;
        double contaPow3 = Math.pow(conta3, 3);
        double contaPotDivFim = Math.pow(10 , 3) ;
        double resultFinal = contaPow3 / contaPotDivFim ;

        System.out.println("\n([6 * (3 + 2)]P2 / 3 * 2 - ((1 - 5) * (2 - 7) / 2)P2)P3 / 10P3");

        System.out.println("\nResultado conta1 -> 6 * (3 + 2) = " + conta1 + "\nResultado resultPow1 -> 30 " +
                "potencia 2 = " +
                " " + contaPow1 +
                "\nResultado" +
                " " +
                "conta1b. Primeira expressão -> 90 / 3 * 2 = " + conta1DivFim);

        System.out.println("\nResultado conta2 -> (1 - 5) * (2 - 7) = " + conta2 + "\nResultado conta2a -> 20 / 2 = " +
                conta2Div + "\nResultado " +
                "resultPow2 -> 10 potencia 2 = " + contaPow2Fim);

        System.out.println("\nResultado terceira expressão -> 150 - 100 = " + conta3 + "\nResultado resultPow3 -> 50 " +
                "potencia 3 = " +
                contaPow3 + "\nFinal potencia -> 125000.0 / 10 potencia 3 = " + resultFinal);







    }
}

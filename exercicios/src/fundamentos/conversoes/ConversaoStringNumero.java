package fundamentos.conversoes;

import javax.swing.*;
import java.math.BigDecimal;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: "); //APARECE UM JANELA PRA DIGITÇÃO
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: "); //APARECE UM JANELA PRA DIGITÇÃO

        System.out.println(valor1 + valor2); //CONCATENA OS VALORES

        double numero1 = Double.parseDouble(valor1); //CONVERTENDO VALORES GUARDADOS
        double numero2= Double.parseDouble(valor2); //CONVERTENDO VALORES GUARDADOS

        double soma = numero1 + numero2; //SOMANDO OS VALORES
        System.out.println("A SOMA É: " + soma);
        System.out.println("A MÉDIA É: " + soma / 2);



    }
}

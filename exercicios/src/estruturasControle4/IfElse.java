package estruturasControle4;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o numero: ");
        int numero = Integer.parseInt(valor);

        /*
        if(numero % 2 ==0 ){
            System.out.println("Numero Par");
        }if(numero % 2 == 1){
            System.out.println("Numero Ímpar");
        }
        */

        if(numero % 2 ==0 ){
            System.out.println("Numero Par");
        }else{
            System.out.println("Numero Ímpar");
        }
    }
}

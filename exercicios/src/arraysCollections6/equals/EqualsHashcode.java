package arraysCollections6.equals;

import java.util.Date;

public class EqualsHashcode {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "PedroS@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "PedroS@email.com";

        System.out.println("Comparação com '==' (memória guardada) -> " + (u1 == u2));
        //System.out.println("Comparação com == -> " + (u1 == u1));
        //System.out.println("Comparação com equals() -> " + u1.equals(u1));
        System.out.println("Comparação com equals() (u1.equals(u2)) -> " + u1.equals(u2));
        System.out.println("Comparação com equals() (u2.equals(u1)) -> " + u2.equals(u1));

        // PRECISA FAZER A CONVERSÃO(CAST) NA CLASSE USUARIO
        System.out.println("Comparando se o obj New Date é uma instância de Usuario (contém os mesmos 'dados') -> " + u2.equals(new Date()));

    }
}

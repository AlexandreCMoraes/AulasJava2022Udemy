package arraysCollections6.equals;

public class EqualsHashcode {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "PedroS@email.com";

        Usuario u2 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "PedroS@email.com";

        System.out.println("Comparação com == -> " + (u1 == u2));
        //System.out.println("Comparação com == -> " + (u1 == u1));
        //System.out.println("Comparação com equals() -> " + u1.equals(u1));
        System.out.println("Comparação com equals() -> " + u1.equals(u2));
        System.out.println("Comparação com equals() -> " + u2.equals(u1));

    }
}

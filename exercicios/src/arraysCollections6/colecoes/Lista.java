package arraysCollections6.colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<UsuarioList> lista = new ArrayList<>();

        // ADD OBJ ASSIM
        UsuarioList u1 = new UsuarioList("Ana");
        lista.add(u1);

        // ADD OBJ ASSIM
        lista.add(new UsuarioList("Carlos"));
        lista.add(new UsuarioList("Lia"));
        lista.add(new UsuarioList("Bia"));
        lista.add(new UsuarioList("Manu"));

        System.out.println("Trazendo o elemento indicado -> " + lista.get(3).nome);
        System.out.println(lista.get(2).nome);
        System.out.println(lista.get(2));
        System.out.println();

        lista.remove(1); // CARLOS FOI REMOVIDO
        //lista.remove(new UsuarioList("Manu"));
        System.out.println("Foi removido? -> " + lista.remove(new UsuarioList("Manu"))); // COMENTAR A LINHA DE CIMA
        // MOSTRA TRUE

        System.out.println("Tem na lista? -> " + lista.contains(new UsuarioList("Carlos")));

        for (UsuarioList user: lista){
            System.out.println(user.nome);
            System.out.println(user);
        }
        System.out.println();
        for (UsuarioList user: lista){
            System.out.println(user.toString());
        }

    }
}

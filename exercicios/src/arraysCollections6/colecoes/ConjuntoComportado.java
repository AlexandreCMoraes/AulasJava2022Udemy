package arraysCollections6.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        System.out.println("Set/HashSet não respeita ordem de inserção");

        Set<String> listaAprovados = new HashSet<String>(); // LISTA SERÁ STRING
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Roberto");

        System.out.println(listaAprovados);

        // SET NAO RESPEITA ORDEM
        for(String candidato : listaAprovados){
            System.out.println(candidato);
        }

        System.out.println("\nSet/TreeSet<>() respeita ordem de inserção");
        SortedSet<String> listaAprovados0 = new TreeSet<>(); // LISTA SERÁ STRING
        listaAprovados0.add("Ana");
        listaAprovados0.add("Carlos");
        listaAprovados0.add("Lucas");
        listaAprovados0.add("Roberto");

        for(String candidatos : listaAprovados0){
            System.out.println(candidatos);
        }

        System.out.println();

        Set<Integer> nums = new HashSet<>(); // LISTA SERÁ INT
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n : nums){
            System.out.println(n);
        }

    }
}

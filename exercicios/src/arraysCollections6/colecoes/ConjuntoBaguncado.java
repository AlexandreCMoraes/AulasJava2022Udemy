package arraysCollections6.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        // FARÁ A CONVERSÃO AUTOMÁTICA PARA AS CLASSES RESPECTIVAS
        conjunto.add(1.2); // DOUBLE
        conjunto.add(true); // BOOLEAN
        conjunto.add("Teste"); // STRING
        conjunto.add(1); // INTEGER
        conjunto.add('x'); //CHARACTER

        System.out.println("Mostrando dados misturados\n");
        System.out.println("Tamanho usando size -> " + conjunto.size());

        // SE TENTAR ADD OUTRO COM O MESMO OUTRO NOME
        conjunto.add("teste"); // STRING
        System.out.println("Tamanho usando size add outro dado -> " + conjunto.size());

        // AGORA USANDO O MESMO DADO, MOSTRA O MESMO TAMANHO
        conjunto.add("Teste"); // STRING
        System.out.println("Tamanho usando size add mesmo dado -> " + conjunto.size());

        System.out.println("Remover dado (se existir no conjunto) mostra dado booleano (true ou false) -> "
                + conjunto.remove("teste"));
        System.out.println("Tamanho usando size -> " + conjunto.size());

        System.out.println("Se contém um dado dentro do conjunto, true ou false -> " + conjunto.contains('x'));

        // VARIÁVEL DO TIPO SET
        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("\nMostrando os valores -> " + nums);
        System.out.println("Mostrando os valores -> " + conjunto);

        // ADD UM NO OUTRO (NUMS NO CONJUNTO)
        //conjunto.addAll(nums);
        //System.out.println("União entre dois conjuntos" + conjunto);

        // INTERSECÇÃO
        conjunto.retainAll(nums);
        System.out.println("Mostrando intersecção (no caso somente 1) -> " + conjunto);

        conjunto.clear();
        System.out.println("Limpa o conteudo passado -> " + conjunto);
    }
}

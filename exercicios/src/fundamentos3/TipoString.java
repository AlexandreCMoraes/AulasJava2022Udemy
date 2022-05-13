package fundamentos3;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá, mundo".charAt(2));

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!!!"));
        s = s.toLowerCase();
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("bm"));
        System.out.println(s.endsWith("e"));
        System.out.println(s.length());

        var nome = "Ale";
        var sobrenome = "Moraes";
        var idade = 30;
        var salario = 6_552.55;

//        System.out.printf("\nnome: %s %s", nome, sobrenome , "\nidade: %d", idade , "\nsalario: %.2f.", salario);
        System.out.printf("\n\nNome: %s %s, \nidade: %d, \nsalario: R$ %.2f.",  nome, sobrenome, idade, salario);

    }
}

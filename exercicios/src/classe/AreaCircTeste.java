package classe;

public class AreaCircTeste {

    public static void main(String[] args) {

        AreaCirc a = new AreaCirc(5.6);
        System.out.println("Chama constructor e a instancia " + a.area()); //CHAMA CONSTRUCTOR ACIMA COM CLASSE AREA

        AreaCirc a1 = new AreaCirc(10);
        a1.raio = 10;
        //a1.pi = 10; //MUDANDO VALOR DE PI, POIS NAO É STATIC (PERTENCENTE A CLASSE)
        //System.out.println(a1.area()); //CHAMA CONSTRUCTOR ACIMA COM CLASSE AREA

        AreaCirc a2 = new AreaCirc(5);
        a2.raio = 100;
        //a2.pi = 5; //MUDANDO VALOR DE PI, POIS NAO É STATIC (PERTENCENTE A CLASSE)

        System.out.println("Chama constructor e a instancia " + a2.area()); //CHAMA CONSTRUCTOR ACIMA COM CLASSE AREA
        System.out.println("Chama constructor e a instancia " + a1.area()); //CHAMA CONSTRUCTOR ACIMA COM CLASSE AREA
        System.out.println("Classe interna do java " + Math.PI);
        System.out.println("Acessa a classe e seus atributos " + AreaCirc.PI); //ACESSA A CLASSE E SEUS ATRIBUTOS
        System.out.println("Acessa a classe e seus constructor " + AreaCirc.area(100));

    }
}

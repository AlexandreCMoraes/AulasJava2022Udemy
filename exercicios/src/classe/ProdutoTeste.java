package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook",  4356.89); //CONSTRUCTOR COM PARAMETRO DE NOME (EXPLICITO)
        //Produto p1 = new Produto(); //CONTRUTOR PADRAO SEM PARAMETRO
        //p1.nome = "Notebook";
        //p1.preco = 4356.89;
        //p1.desconto = 0.25;

        //var p2 = new Produto("Caneta preta"); //CONSTRUCTOR COM PARAMETRO DE NOME (EXPLICITO)
        var p2 = new Produto(); //CONTRUTOR PADRAO SEM PARAMETRO
        p2.nome = "Caneta preta2";
        p2.preco = 12.56;
        //p2.desconto = 0.29;

        Produto.desconto = 0.29;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto(0));

        //double precoFinal1 = p1.preco * (1 - p1.desconto);
        //double precoFinal2 = p2.preco * (1 - p2.desconto);

        double precoFinal1 = p1.precoComDesconto(); //METODO FEITO NO DATA S/ ATRIBUTO
        double precoFinal2 = p2.precoComDesconto(0.1); //METODO FEITO NO DATA C/ ATRIBUTO
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

    }
}

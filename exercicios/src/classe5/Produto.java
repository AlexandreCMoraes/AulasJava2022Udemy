package classe5;

public class Produto {

    String nome;
    double preco;
    //double desconto;
    static double desconto = 0.25;

    //CONSTRUCTOR SEM PARAMETRO
    Produto(){}

    //CONSTRUCTOR COM PARAMETROS
    Produto(String nomeInicial, double precoInicial){ //PASSANDO PARAMETRO DE NOME NO
        // CONSTRUCTOR
        nome = nomeInicial;
        preco =  precoInicial;
        //desconto = descontoInicial;
    }

    //FEITO PARA NAO REPLICAR A TD MOMENTO A CONTA NO ProdutoTeste
    double precoComDesconto(){
        return preco * (1 / desconto);
    }

    //FEITO COM ATRIBUTOS
    double precoComDesconto(double descontoGerente){
        return preco * (1 / desconto + descontoGerente);
    }
}

package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    //FEITO PARA NAO REPLICAR A TD MOMENTO A CONTA NO ProdutoTeste
    double precoComDesconto1(){
        return preco * (1 / desconto);
    }

    //FEITO COM ATRIBUTOS
    double precoComDesconto2(double descontoGerente){
        return preco * (1 / desconto + descontoGerente);
    }
}

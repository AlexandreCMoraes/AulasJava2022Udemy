package classe5.desafioModulo;

public class Pessoa {

    String nomePessoa; //COLOCAR NOME DA PESSOA NA CLASSE JANTAR
    double pesoPessoa; //COLOCAR PESO DA PESSOA NA CLASSE JANTAR

    public Pessoa(String nomePessoa, double pesoPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    void Comer(Comida comida){ //RECEBE O OBJ
        if(comida != null){ //VALIDAR SE COMIDA FOR DIFERENTE DE NULO, ENTAO ADD NO PESOPESSOA
            this.pesoPessoa += comida.pesoComida;
        }
    }

    String dadosPessoa(){ //P/ NÃO FICAR ESCREVENDO TANTO NO MAIN DE JANTAR
        return "Meu nome é " + nomePessoa + " e tenho " + pesoPessoa + " kg.";
    }
}

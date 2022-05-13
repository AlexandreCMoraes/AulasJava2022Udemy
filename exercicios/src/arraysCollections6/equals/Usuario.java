package arraysCollections6.equals;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {
        Usuario outro = (Usuario) objeto; //FEITO O CAST, CONVERSÃO DE OBJETO PARA USUARIO
        //boolean nomeIgual = outro.nome == this.nome;
        //boolean emailIgual = outro.email == this.email;

        //TODO ERRO DE EXCEÇÃO
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);

        return nomeIgual && emailIgual;
    }
}

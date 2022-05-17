package arraysCollections6.equals;

public class Usuario {
    String nome;
    String email;

    // IMPLEMENTAÇÃO DE EQUALS P/ COMPARAR OBJETOS
    public boolean equals(Object objeto) {
        //Usuario outro = (Usuario) objeto; //FEITO O CAST, CONVERSÃO DE OBJETO PARA USUARIO P/ FAZER A COMPARAÇÃO
        // NESSE CASO NÃO É UMA BOA PRÁTICA
        //boolean nomeIgual = outro.nome == this.nome;
        //boolean emailIgual = outro.email == this.email;

        //SE OBJETO FEITO ACIMA FOR UMA INSTANCIA(OBJETO) DE USUARIO, ENTÃO RETORNA O OBJETO
        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto; //FEITO O CAST, CONVERSÃO DE OBJETO PARA USUARIO P/ FAZER A COMPARAÇÃO
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            // SE NOME E EMAIL FOR IGUAL
            return nomeIgual && emailIgual;
        }else{
            return false;
        }

        /*
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);

        // SE NOME E EMAIL FOR IGUAL
        return nomeIgual && emailIgual;
        */
    }
}

package arraysCollections6.colecoes;

import java.util.Objects;

public class UsuarioList {

    String nome;

    public UsuarioList(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Olá, " + this.nome + "!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioList that = (UsuarioList) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

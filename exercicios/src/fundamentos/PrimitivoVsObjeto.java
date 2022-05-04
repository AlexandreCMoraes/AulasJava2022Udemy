package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        //PRIMITIVO
        String s = "texto";
        s.toUpperCase();

        //CRIACAO DE OBJETO
        String a  = new String("texto");
        a.toLowerCase();

        //PRIMITVO QUE NAO SE CRIA OBJETO, PRECISA DE WRAPPERS  QUE SAO A VERSAO OBJETO DOS TIPOS PRIMITIVOS
        int b  = 333;
        System.out.println(a);

    }
}

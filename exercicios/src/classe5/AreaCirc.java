package classe5;

public class AreaCirc {

    double raio;
    //double pi;
    static final double PI = 3.14; //SET PARA SOMENTE ASSOCIADO A CLASSE E NÃO AS INSTANCIAS

    //CONSTRUCTOR DE AREACIRC
    AreaCirc(double raioInicial) {
        //pi = 3.14;
        raio = raioInicial;
    }

    //CLASSE PARA RESOLUÇÃO
    double area (){
        return PI * raio * raio;
    }

    static double area (double raio){
        return PI * raio * raio;
    }
}

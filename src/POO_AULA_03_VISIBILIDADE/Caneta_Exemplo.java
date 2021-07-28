package POO_AULA_03_VISIBILIDADE;

public class Caneta_Exemplo {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //não pode acessar, pois o acesso é privado
        //c1.ponta=0.5f;
        //deixa acessar, pois ela esta dentro de uma classe " main ", porém não posso mexer em privada
        //pode mexer em privado, se o acesso for publico, mas dentro o codigo seja privado
        //exemplo o "void tampar"
        c1.carga = 80;
        //c1.tampada=true;
        c1.status();
        c1.rabiscar();
    }
}

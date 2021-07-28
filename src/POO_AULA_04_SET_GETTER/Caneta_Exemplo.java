package POO_AULA_04_SET_GETTER;

public class Caneta_Exemplo {
    //MetodosGetters Setters Construtor  

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarela", 0.4f);
        Caneta c2 = new Caneta("kkk", "Laranja", 1.5f);
        //c1.setModelo("bic");
        //c1.modelo="bic"; (não posso acessar, porque é privado, só posso com o metodo set)
        //c1.setPonta(0.5f);
        //c1.ponta=0.5f;   (não posso acessar, porque é privado, só posso com o metodo set)
        //c1.status();
        //System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta "+c1.getPonta());
        c1.status();
        System.out.println("$$$");
        c2.status();
    }
}

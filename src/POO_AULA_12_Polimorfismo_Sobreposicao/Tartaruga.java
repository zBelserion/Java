package POO_AULA_12_Polimorfismo_Sobreposicao;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Tartaruga herda tudo da classe Reptil

public class Tartaruga extends Reptil {

    @Override
    public void locomover() {
        System.out.println("caminhando beeeem devagar");
    }

}

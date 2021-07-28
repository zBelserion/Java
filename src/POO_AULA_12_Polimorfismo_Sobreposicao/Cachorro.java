package POO_AULA_12_Polimorfismo_Sobreposicao;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Cachorro herda tudo da classe Mamifero

public class Cachorro extends Mamifero {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au! ");
    }
}

package POO_AULA_12_Polimorfismo_Sobreposicao;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Canguru herda tudo da classe Mamifero

public class Canguru extends Mamifero {

    //override=sobreescrever ou sobreposto
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    //override=sobreescrever ou sobreposto
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
}

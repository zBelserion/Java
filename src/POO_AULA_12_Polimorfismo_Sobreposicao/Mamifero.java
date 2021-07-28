package POO_AULA_12_Polimorfismo_Sobreposicao;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Mamifero herda tudo da classe Animal

public class Mamifero extends Animal {

    //Atributos
    private String corPelo;

    //override=sobreescrever ou sobreposto
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    //METODOS GETTERS E SETTERS
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}

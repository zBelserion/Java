package POO_AULA_13_Polimorfismo_Sobrecarga;

//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Mamifero herda tudo da classe Animal
public class Mamifero extends Animal {

    //ATRIBUTOS
    protected String corPelo;

    //override=sobreescrever ou sobreposto
    @Override
    public void emitirSom() {
        System.out.println("Som do mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}

package POO_AULA_12_Polimorfismo_Sobreposicao;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Reptil herda tudo da classe Animal

public class Reptil extends Animal {

    //ATRIBUTOS
    private String corEscama;

    //override=sobreescrever ou sobreposto
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    //METODOS GETTERS E SETTERS
    public String getCorEscama() {
        return corEscama;
    }

    //METODOS GETTERS E SETTERS
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}

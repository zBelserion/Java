package POO_AULA_12_Polimorfismo_Sobreposicao;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Ave herda tudo da classe Animal

public class Ave extends Animal {

    //ATRIBUTOS
    private String corPena;

    //METODOS PUBLICOS
    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void emitirSom() {
        System.out.println("Som da ave");
    }

    //METODOS GETTERS E SETTERS     
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}

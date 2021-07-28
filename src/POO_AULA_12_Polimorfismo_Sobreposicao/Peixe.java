package POO_AULA_12_Polimorfismo_Sobreposicao;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Peixe herda tudo da classe Animal

public class Peixe extends Animal {

    //ATRIBUTOS
    private String corEscama;

    //METODOS PUBLICOS
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    //METODOS GETTERS E SETTERS
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}

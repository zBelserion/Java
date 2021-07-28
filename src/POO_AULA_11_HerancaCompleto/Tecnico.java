package POO_AULA_11_HerancaCompleto;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Tecnico herda tudo da classe Pessoa

public class Tecnico extends Pessoa {

    //ATRIBUTOS
    private int registro;

    //METODOS PUBLICOS
    public void praticar() {
        System.out.println("Esta exercendo o seu papel");
    }

    //METODOS GETTERS E SETTERS
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
}

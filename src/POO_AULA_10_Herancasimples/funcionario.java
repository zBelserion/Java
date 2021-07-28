package POO_AULA_10_Herancasimples;

//sub classe (filha) antes do extends; e classe (mãe) depois do extends

public class funcionario extends Pessoa {

    //ATRIBUTOS
    private String setor;
    private boolean trabalhando;

    //METODOS PUBLICOS
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}

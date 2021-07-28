package POO_AULA_10_Herancasimples;

//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => aluno herda tudo da classe Pessoa
public class aluno extends Pessoa {

    //ATRIBUTOS
    private int matricula;
    private String curso;

    //METODOS PUBLICOS
    public void cancelarMatri() {
        System.out.println("Matricula será cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}

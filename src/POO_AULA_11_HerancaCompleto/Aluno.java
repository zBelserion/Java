package POO_AULA_11_HerancaCompleto;
//public final class Aluno extends Pessoa {
//final => classe final, não poderia ser sobreposto, iria dar erro na classe bolsista

//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Aluno herda tudo da classe Pessoa
public class Aluno extends Pessoa {

    //ATRIBUTOS
    private int matricula;
    private String curso;

    //METODOS PUBLICOS
    //public final void pagarMensalidade(){
    //final => metodo final, não poderia ser sobreposto, iria dar erro no metodo pagar mensalidade de bolsista
    //}
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno "+this.getNome());
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

package POO_AULA_10_Herancasimples;

//sub classe (filha) antes do extends; e classe (mãe) depois do extends

public class professor extends Pessoa {

    //ATRIBUTOS
    private String especialidade;
    private double salario;

    //METODOS PUBLICOS
    public void receberAum(float aum) {
        this.salario += aum;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

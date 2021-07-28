package POO_AULA_11_HerancaCompleto;

//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Professor herda tudo da classe Pessoa
public class Professor extends Pessoa {
    //ATRIBUTOS

    private String especialidade;
    private float salario;

    //METODOS PUBLICOS
    public void receberAumento(float aum) {
        this.salario += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}

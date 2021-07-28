package POO_AULA_14_Exercicio;

//classe abstrata não pode ser instanciada => não pode virar objeto
public abstract class Pessoa {

    //ATRIBUTOS
    protected String nome, sexo;
    protected int idade;
    protected float experiencia;

    //METODOS PERSONALIZADOS
    //caso a ordem pedida esteja diferente da instanciada no programa principal, irá dar erro
    public Pessoa(String nome, int idade, String sexo) {//METODO CONSTRUTOR
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }

    //METODOS PUBLICOS
    public boolean ganharExp() {
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    //override=sobreescrever ou sobreposto
    @Override
    //METODO toString(), mostra todos os dados. vai em inserir codigo
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", experiencia=" + experiencia + '}';
    }
    
}

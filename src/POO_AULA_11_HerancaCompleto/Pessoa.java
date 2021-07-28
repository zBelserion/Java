package POO_AULA_11_HerancaCompleto;

//classe abstrata não pode ser instanciada => não pode virar objeto
public abstract class Pessoa {

    //ATRIBUTOS
    private String nome, sexo;
    private int idade;

    //METODOS PUBLICOS
    public void fazerAniv() {
        this.idade++;
    }

    //METODOS GETTERS E SETTERS
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

    //override=sobreescrever ou sobreposto
    @Override
    //METODO toString(), mostra todos os dados, vai em inserir codigo
    public String toString() {
        //return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}'; padrão
        return "Dados{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';// sobreescrita
    }

}

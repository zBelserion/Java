package POO_AULA_10_Herancasimples;

    public class Pessoa {

    //ATRIBUTOS
    private String nome, sexo;
    private int idade;

    // METODOS PUBLICOS
    public void fazerAniv() {
        this.idade++;

    }
    //Não pode usar metodo construtor na classe, pois vai dar erro quando tentar usar o " extends ", verificar depois
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

    //METODO toString(), mostra todos os dados, vai em inserir codigo
    //override=sobreescrever ou sobreposto
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }

}

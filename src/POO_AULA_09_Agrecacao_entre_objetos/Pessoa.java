package POO_AULA_09_Agrecacao_entre_objetos;

public class Pessoa {

    //ATRIBUTOS
    private String nome, sexo;
    private int idade;

    //METODOS PUBLICOS
    public void fazerAniver() {
        this.idade++;

    }
    //METODOS ESPECIAIS CONSTRUTOR, GETTERS E SETTERS

    public Pessoa(String nome, int idade, String sexo) {  //METODO CONSTRUTOR
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
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

    public void setIdade(byte idade) {
        this.idade = idade;
    }

}

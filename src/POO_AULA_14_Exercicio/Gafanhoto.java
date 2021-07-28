package POO_AULA_14_Exercicio;
//herança e encapsulado
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Ganfanhoto herda tudo da classe Pessoa

public class Gafanhoto extends Pessoa {

    //ATRIBUTOS
    private String login;
    private int totAssistido;

    //METODOS PERSONALIZADOS
    //super => gafanhoto e a subclasse de Pessoa, logo Pessoa é a superclasse
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    //METODOS PUBLICOS
    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //override=sobreescrever ou sobreposto
    @Override
    //polimorfismo de sobreposição
    //METODO toString(), mostra todos os dados. vai em inserir codigo
    public String toString() {
        //super.toString() = chamando o toString de super, o toString da classe Pessoa
        return "Gafanhoto{" + super.toString() + "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }

}

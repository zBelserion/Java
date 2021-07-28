package POO_AULA_14_Exercicio;

public class Visualizacao {

    //Agregando Gafanhoto a espectador, ou seja, um espectador é um gafanhoto (pessoa)
    //e Video a filme, ou seja, filme é um video
    //sempre usar a classe antes, e depois o atributo
    //ATRIBUTOS
    private Gafanhoto espectador; //espectador => classe gafanhoto
    private Video filme;          //filme => classe video

    //METODOS PERSONALIZADOS
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        //atualizando o valor de setTotAssistido, pegando o total e adicionando +1
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        //atualizando o valor de setViews, pegando o total e adicionando +1
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //METODOS PUBLICOS COM SOBRECARGA, MESMOS NOMES E ASSINATURAS DIFERENTES
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    //METODOS GETTERS E SETTERS
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //override=sobreescrever ou sobreposto
    //METODO toString(), mostra todos os dados. vai em inserir codigo
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }

}

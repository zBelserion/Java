package POO_AULA_14_Exercicio;

//implements AcoesVideo = implementa o AcoesVideo, que seria a interface
//implementar todos metodos para abstratos
public class Video implements AcoesVideo {

    //ATRIBUTOS
    private String titulo;
    private int curtidas, views, avaliacao;
    private boolean reproduzindo;

    //METODOS PUBLICOS PERSONALIZADO
    public Video(String titulo) {//METODO CONSTRUTOR
        this.titulo = titulo;
        this.avaliacao= 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    //METODOS ABSTRATOS DA INTERFACE
    //override=sobrescrever ou sobreposto
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    //override=sobreescrever ou sobreposto
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    //METODOS GETTERS E SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        //fazendo a media das visualizações
        int nova;
        nova = (int) (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = nova;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //override=sobreescrever ou sobreposto
    @Override
    //METODO toString(), mostra todos os dados. vai em inserir codigo
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", curtidas=" + curtidas + ", views=" + views + ", avalicao=" + avaliacao + ", reproduzindo=" + reproduzindo + '}';
    }

}

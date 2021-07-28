package POO_AULA_09_Agrecacao_entre_objetos;

//sempre usar '' implements '' para implementar a interface a classe
//implementar todos metodos para abstratos 
public class Livro implements publicacao {

    //ATRIBUTOS
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor; //leitor = classe de pessoa

    //METODOS PUBLICOS
    //METODO toString(), mostra todos os dados, vai em inserir codigo
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas="
                + totPaginas + ", pagAtual=" + pagAtual + ", aberto=" + aberto + "\n, leitor=" + leitor.getNome()
                + ", idade=" + leitor.getIdade() + ", leitor=" + leitor.getSexo() + '}';
        //não pode deixar leitor= leitor, pq assim ele retorna a referencia ao objeto pessoa, precisa usar
        //o get.Nome()
    }

    //METODOS ESPECIAIS 
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    //GETTERS E SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    //IMPLEMENTAÇÃO ABSTRATA
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.pagAtual)
            this.pagAtual = 0;
        else
            this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

}

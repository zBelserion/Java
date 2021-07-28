package POO_AULA_07_Relacionamento_Entre_Classes;

//importação random
import java.util.Random;

public class Luta {

    //ATRIBUTOS
    //desafiado e desafiante tipo lutador, tipo abstrato,vai ser um objeto da classe lutador
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //instanciando random

    //METODOS Publicos ou personalizados
    //recebe o parametro lutador, porque é um objeto da classe lutador
    public void marcarLuta(Lutador l1, Lutador l2) {
        //verificando se a categoria são as mesma e se o lutador 1 é diferente do lutador 2

        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.getAprovada()) { //verificando se a luta foi aprovada
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();  //desafiado é um objeto do tipo lutador, então posso usar os metodos do objeto lutador
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random rdn = new Random(); //CRIANDO O RANDOM E ATRIBUINDO 3 VALORES AO RANDOM
            int vencedor = rdn.nextInt(3);
            System.out.println("##### RESULTADO DA LUTA #####");
            switch (vencedor) {
                case 0: //EMPATOU
                    System.out.println("EMPATOU");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // DESAFIADO GANHOU
                    System.out.println("Vitoria do: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // DESAFIANTE GANHOU
                    System.out.println("Vitoria do: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("######################");
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
    //METODOS GETTERS E SETTERS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}

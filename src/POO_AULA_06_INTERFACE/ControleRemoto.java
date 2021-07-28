package POO_AULA_06_INTERFACE;

//implements Controlador = implementa o controlador, que seria a interface
//implementar todos metodos para abstratos
public class ControleRemoto implements Controlador {
    //ATRIBUTOS

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //METODOS MODO CONSTRUTOR, GETTERS E SETTERS
    public ControleRemoto() { // METODO CONSTRUTOR
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {// METODO GETTERS
        return volume;
    }

    private void setVolume(int volume) {//METODO SETTERS
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //METODOS ABSTRATOS // INTERFACE
    //override = sobreescrever, já tinha um metodo definido, porém vai ser alterado
    //crtl+e = apaga a linha que estiver
    @Override
    //metodo ligar
    public void ligar() {
        //recebe o valor verdadeiro
        this.setLigado(true);
    }

    @Override
    //metodo desligar
    public void desligar() {
        //recebe o valor falso
        this.setLigado(false);
    }

    @Override
    //metodo abrir menu
    public void abrirMenu() {
        if (this.getLigado()) {

            //verificando se esta ligado, tocando e o volume
            System.out.println("## MENU ##");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            //a cada 10 de volume, vai receber 1 barra
            for (int i = 1; i <= this.getVolume(); i += 10) {
                System.out.print(" | ");
            }
            System.out.println("");
        } else {
            System.out.println("A tv está desligada!!");
        }
    }

    @Override
    //metodo fechar menu
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    //metodo mais volume
    public void maisVolume() {
        //verificando se esta ligado, acrescenta +5 no volume
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumenta volume ");
        }
    }

    @Override
    //metodo menosvolume
    public void menosVolume() {
        //verificando se esta ligado, descrementa -5 no volume
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir volume ");
        }
    }

    @Override
    //metodo ligarmudo
    public void ligarMudo() {
        //verificando se esta ligado e o volume é maior que 0, vai mutar
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            this.setTocando(false);

        }
    }

    @Override
    //metodo desligarmudo
    public void desligarMudo() {
        //verificando se esta ligado e o volume esta em 0, vai desmutar
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            this.setTocando(true);

        }
    }

    @Override
    //metodo play
    public void play() {
        //verificando se esta ligado e não tocando, vai dar play
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não conseguir ligar");
        }
    }

    @Override
    //metodo pause
    public void pause() {
        //verificando se esta ligado e esta tocando, vai dar pause
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}

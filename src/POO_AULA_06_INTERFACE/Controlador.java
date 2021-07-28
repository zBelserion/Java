package POO_AULA_06_INTERFACE;
// crtl+e apaga as linhas

public interface Controlador {
    //publico, abstrato, void, metodo   
    //nem sempre pode ser void, vai depender do que retornar

    public abstract void ligar();

    public abstract void desligar();

    public abstract void abrirMenu();

    public abstract void fecharMenu();

    public abstract void maisVolume();

    public abstract void menosVolume();

    public abstract void ligarMudo();

    public abstract void desligarMudo();

    public abstract void play();

    public abstract void pause();
}

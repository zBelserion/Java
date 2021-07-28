package POO_AULA_03_VISIBILIDADE;

public class Caneta {

    //ATRIBUTOS
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //METODOS PUBLICOS
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não pode rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    //posso acesar o tampada privado, pois o tampar é publico, mas somente aqui na classe, fora não
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}

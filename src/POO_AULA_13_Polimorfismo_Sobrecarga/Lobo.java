package POO_AULA_13_Polimorfismo_Sobrecarga;

//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Lobo herda tudo da classe Mamifero
public class Lobo extends Mamifero {

    //public void emitirSom(int n) {
    //esse metodo não é um override, precisa ter a mesma assinatura da sua classe mãe, senão vai reclamar
    //override=sobreescrever ou sobreposto
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuu!");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}

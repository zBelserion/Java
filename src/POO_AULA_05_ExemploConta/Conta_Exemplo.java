package POO_AULA_05_ExemploConta;

public class Conta_Exemplo {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.sacar(150);
        c1.fecharConta();
       

        Conta c2 = new Conta();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
}

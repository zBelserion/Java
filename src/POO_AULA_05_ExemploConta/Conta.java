package POO_AULA_05_ExemploConta;

public class Conta {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos personalizados
    public void estadoAtual() {
        System.out.println("-------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        //set = recebe um parametro, que no caso é o t de tipo
        //passando o tipo da conta e se esta aberta ou fechada
        this.setTipo(t);
        this.setStatus(true);
        // verificando o tipo da conta
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta");
    }

    public void fecharConta() {
        //verificar se o saldo é positivo
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada ainda contem dinheiro");
            //verificar se o saldo é negativo
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pdoe ser fechada ainda tem ");
        } else {
            //verificar se o saldo é 0, se for status recebe falso e fecha a conta
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo=this.saldo+v;
            // esse metodo é mais usado, mexe diretamente com os metodos
            //set modifica o saldo, recebendo o saldo atual+ deposito (v)
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                //recebe o valor que sair de (this.getSaldo)
                //set modifica o saldo, recebendo o saldo atual - saque (v)
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        //verifica o tipo de conta e recebe um valor
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        //verificando se o status é verdadeiro, se for ele entra e paga a mensalidade
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }

    //Metodos especiais
    public void Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

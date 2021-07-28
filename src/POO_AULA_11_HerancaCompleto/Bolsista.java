package POO_AULA_11_HerancaCompleto;
//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => bolsita herda tudo da classe aluno, pois tem os mesmo atributos

public class Bolsista extends Aluno {

    //ATRIBUTOS
    private float bolsa;
    
    //METODOS PUBLICOS
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    //override=sobreescrever ou sobreposto
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista! pagamento facilitado ");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}

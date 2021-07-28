package POO_AULA_11_HerancaCompleto;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); não pode ser instanciada, pois a classe pessoa é abstrata
        //herança pobre, não tem implementação
        /*Visitante v1=new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        //herança pra diferença tem implementação propria
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        //esse metodo não esta sobreposto ou seja, são diferentes
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        //esse metodo esta sobreposto ou seja, são diferentes
        b1.pagarMensalidade();

    }
}

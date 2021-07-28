package POO_AULA_10_Herancasimples;

public class Pessoa_Exemplo {

    public static void main(String[] args) {
        // em vez de ser só p1 até p4, precisa colocar antes o nome da classe para instanciar
        Pessoa p1 = new Pessoa();
        aluno p2 = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        p2.setCurso("informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        //até aqui tudo vai aparecer como a classe " pessoa ", não pode ser alterado por enquanto
        
        //p1.receberAumento(550.20f); não pode mexer, pois a classe não pode alterar a subclasse
        //p2.mudarTrabalho();não pode mexer, pois a classe não pode alterar a subclasse
        //p4.cancelarMatr();não pode mexer, pois a classe não pode alterar a subclasse
        //a classe não faz coisas que as subclasses fazem, mas as subclasses faz o que a classe faz
        
        // to string = retorna uma string, então precisa do sout, pra retornar o que tem nele
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
}

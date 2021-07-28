package POO_AULA_09_Agrecacao_entre_objetos;

public class Livro_Exemplo {

    public static void main(String[] args) {
        //criando vetor e instanciando
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        //criando e preenchendo os vetores
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        //p[0]= Classe (Pessoa leitor) => 1 pessoa
        l[0] = new Livro("Aprendendo java", " José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java avançado", "Maria candido", 800, p[0]);

        l[0].abrir();
        l[0].folhear(300);
        l[0].avancarPag();
        // to string = retorna uma string, então precisa do sout, pra retornar o que tem nele
        System.out.println(l[0].detalhes());

    }

}

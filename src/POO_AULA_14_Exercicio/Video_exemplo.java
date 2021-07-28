package POO_AULA_14_Exercicio;

public class Video_exemplo {

    public static void main(String[] args) {
        //Criando vetores pra video, com 3 espaços, e instanciando
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 13 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        //Criando vetores pra gafanhoto, com 2 espaços, e instanciando
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "Creuzita");

        //Criando visualização e instanciando, pra informar g[0] e v[1]
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);// Jubileu assiste HTML5
        vis[0].avaliar();
        System.out.println(vis[0]);

        vis[1] = new Visualizacao(g[0], v[1]);//Jubileu assiste php
        vis[1].avaliar(87.0f);
        System.out.println(vis[1]);
        //escrever a informação que tem em v[0] e g[0]
        /*System.out.println("\n##### VIDEOS ####");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println("\n#### GAFANHOTOS #### ");
        System.out.println(g[0]);
        System.out.println(g[1]);*/
    }
}

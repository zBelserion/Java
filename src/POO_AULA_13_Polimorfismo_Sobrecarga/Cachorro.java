package POO_AULA_13_Polimorfismo_Sobrecarga;

//sub classe (filha) antes do extends; e classe (mãe) depois do extends
//extends => Cachorro herda tudo da classe Lobo
public class Cachorro extends Lobo {

    //override=sobreescrever ou sobreposto
    //METODOS PUBLICOS
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        // não precisa usar o "true" ele já reconhece como verdadeiro
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
            //this.emitirSom();
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
           } else 
                if (peso < 10) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }

    // vai dar erro, pq mesmo os parametros sendo diferente, o que conta é a quantidade e o tipo
    // exemplos a baixo, dois parametros e dois tipos int, mesmo mudando o tipo de retorno, também não permite
    //public void reagir(int hora, int min) 
    //public void reagir (int x, int y)
    //public int reagir (int x, int y)
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}

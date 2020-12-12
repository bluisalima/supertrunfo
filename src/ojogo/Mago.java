package ojogo;

public class Mago extends Personagem implements Orc {
    //Atributos
    int forca = 20, habilidade = 80, agilidade = 40;

    //Construtor definindo tipo
    public Mago() {
        tipo = "Mago";
    }

    //Getters
    public int getForca() {
        return forca;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getAgilidade() {
        return agilidade;
    }
    
}

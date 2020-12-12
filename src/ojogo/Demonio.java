package ojogo;

public class Demonio extends Personagem implements Orc {
    //Atributos
    int forca = 80, habilidade = 20, agilidade = 60;

    //Construtor definindo tipo
    public Demonio() {
        tipo = "Demônio";
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

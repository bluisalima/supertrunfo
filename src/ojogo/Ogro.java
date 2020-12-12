package ojogo;

public class Ogro extends Personagem implements Orc {
    //Atributos
    int forca = 60, habilidade = 60, agilidade = 20;

    //Construtor definindo tipo
    public Ogro() {
        tipo = "Ogro";
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

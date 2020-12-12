package ojogo;

public class Robo extends Personagem implements Humano {
    //Atributos
    int inteligencia = 80, velocidade = 20, equipamentos = 60;

    //Construtor definindo tipo
    public Robo() {
        tipo = "Robô";
    }

    //Getters
    public int getInteligencia() {
        return inteligencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getEquipamentos() {
        return equipamentos;
    }
}

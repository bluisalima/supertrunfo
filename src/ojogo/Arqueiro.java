package ojogo;

public class Arqueiro extends Personagem implements Humano {
    //Atributos
    int inteligencia = 60, velocidade = 60, equipamentos = 20;

    //Construtor definindo tipo
    public Arqueiro() {
        tipo = "Arqueiro";
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

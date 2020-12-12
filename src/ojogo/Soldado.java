package ojogo;

public class Soldado extends Personagem implements Humano {
    //Atributos
    int inteligencia = 20, velocidade = 80, equipamentos = 40;

    //Construtor definindo tipo
    public Soldado() {
        tipo = "Soldado";
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

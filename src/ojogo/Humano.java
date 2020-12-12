package ojogo;

public interface Humano {
    //Getters
    public int getInteligencia();

    public int getVelocidade();

    public int getEquipamentos();

    //Métodos de personagem
    public int getVida();

    public String getTipo();

    public void perderVida(int ataque);

    public void ganharVida(int cura);

    public int comparar(int valor);
}

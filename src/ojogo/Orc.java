package ojogo;

public interface Orc {
    //Getters
    public int getForca();

    public int getHabilidade();

    public int getAgilidade();

    //Métodos de personagem
    public int getVida();
    
    public String getTipo();

    public void perderVida(int ataque);

    public void ganharVida(int cura);

    public int comparar(int valor);
}

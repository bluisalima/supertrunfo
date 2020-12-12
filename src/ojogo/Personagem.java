package ojogo;

public abstract class Personagem implements Comparable {
    //Atributos gerais de personagem
    protected int vida = 100;
    protected String tipo = "tipo";

    //Getters
    public int getVida() {
        return vida;
    }
    
    public String getTipo() {
        return tipo;
    }

    //Método para retirar vida
    public void perderVida(int ataque) {
        vida -= ataque;
    }

    //Método para adicionar vida
    public void ganharVida(int cura) {
        vida += cura;
    }

    //Método para comparar vida com um valor
    public int comparar(int valor) {
        if (vida < valor){
            return -1;
        } else if (vida > valor){
            return 1;
        } else {
            return 0;
        }
    }
    
    //Método toString customizado
    public String toString(){
        return tipo + " tem " + vida + " pontos de vida.";
    }
}

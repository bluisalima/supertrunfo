package ojogo;

import java.util.Random;

public class OJogo {

    public static void main(String[] args) {
        //Instanciando vetores e variáveis de fluxo
        Orc[] orcs = new Orc[100];
        Humano[] humanos = new Humano[100];
        int vOrc = 0, vHumano = 0, vidaOrc = 0, vidaHumano = 0, tipo, vida;

        //Instanciando randomizador
        Random gerador = new Random();

        //Laço de repetição principal
        for (int i = 0; i < 100; i++) {
            //Randomizando tipo de orc a ser gerado
            tipo = gerador.nextInt(3);
            System.out.print("\nGerando orc tipo");
            switch (tipo) {
                case 0:
                    System.out.println(" Ogro.");
                    orcs[i] = new Ogro();
                    break;
                case 1:
                    System.out.println(" Mago.");
                    orcs[i] = new Mago();
                    break;
                default:
                    System.out.println(" Demônio.");
                    orcs[i] = new Demonio();
                    break;
            }
            
            //Randomizando tipo de humano a ser gerado
            tipo = gerador.nextInt(3);
            System.out.print("Gerando humano tipo");
            switch (tipo) {
                case 0:
                    System.out.println(" Arqueiro.");
                    humanos[i] = new Arqueiro();
                    break;
                case 1:
                    System.out.println(" Soldado.");
                    humanos[i] = new Soldado();
                    break;
                default:
                    System.out.println(" Robô.");
                    humanos[i] = new Robo();
                    break;
            }

            //Randomizando critério de comparação e calculando resultado
            tipo = gerador.nextInt(3);
            System.out.print("Numa briga de ");
            if (tipo == 0) {
                System.out.print("Força Vs Inteligência,");
                vida = orcs[i].getForca() - humanos[i].getInteligencia();
            } else if (tipo == 1) {
                System.out.print("Habilidade Vs Velocidade,");
                vida = orcs[i].getHabilidade() - humanos[i].getVelocidade();
            } else {
                System.out.print("Agilidade Vs Equipamentos,");
                vida = orcs[i].getAgilidade() - humanos[i].getEquipamentos();
            }

            //Processando resultado e retirando ou adicionando vida conforme necessário
            if (vida < 0) {
                System.out.println(" o " + humanos[i].getTipo() + " venceu por " + (-vida) + " pontos.");
                orcs[i].perderVida(-vida);
                System.out.println(orcs[i]);
                humanos[i].ganharVida(-vida);
                System.out.println(humanos[i]);
            } else if (vida > 0) {
                System.out.println(" o " + orcs[i].getTipo() + " venceu por " + (vida) + " pontos.");
                orcs[i].ganharVida(vida);
                System.out.println(orcs[i]);
                humanos[i].perderVida(vida);
                System.out.println(humanos[i]);
            } else {
                System.out.println(" temos um empate.");
                System.out.println(orcs[i]);
                System.out.println(humanos[i]);
            }

            //Contabilizando vitórias
            if (orcs[i].comparar(humanos[i].getVida()) == -1) {
                vHumano++;
            } else if (orcs[i].comparar(humanos[i].getVida()) == 1) {
                vOrc++;
            }
            
            //Somando total de vida
            vidaOrc += orcs[i].getVida();
            vidaHumano += humanos[i].getVida();
        }
        
        //Exibindo resultados
        System.out.println("\nVitórias Orcs: " + vOrc + " (Vida total: " + vidaOrc + ")");
        System.out.println("Vitórias Humanas: " + vHumano + " (Vida total: " + vidaHumano + ")");

        //Mostrando vencedores
        if (vOrc < vHumano) {
            System.out.println("Humanos venceram!");
        } else if (vOrc > vHumano) {
            System.out.println("Orcs venceram!");
        } else {
            System.out.println("Ninguém venceu, temos um empate.");
        }
    }
}

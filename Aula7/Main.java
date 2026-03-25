package Aula7;

public class Main {
    public static void main(String[] args) {

    Zumbi zumbi = new Zumbi();
    Zumbi zumbi1 = new Zumbi();
    //var zumbi1 = new Zumbi();

    zumbi.nome = "Gagagaga";
    zumbi.força = 500;
    zumbi.vida = 9;

    zumbi1.vida = 12;

    zumbi.morder();

    double vidaZumbi = zumbi.mostraVida();
    System.out.println("Vida do Zumbi: " + vidaZumbi);

    double vidaZumbi1 = zumbi1.mostraVida();
    System.out.println("Vida do Zumbi: " + vidaZumbi1);


    System.out.println("--------------");
    zumbi.tranfereVida(zumbi1, 3);

    System.out.println("Vida do Zumbi: " + zumbi.mostraVida());
    System.out.println("Vida do Zumbi1: " + zumbi1.mostraVida());

     }
    
}
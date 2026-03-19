package Aula7;

public class Zumbi {
    public String nome;
    public double km;
    public int vida;
    public int força;
    
    public void tranfereVida(Zumbi zumbiAlvo, double quantia){
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

     public void mostraVida(){
        System.out.println("Vida do Zumbi: " + vida);

    }

    public void morder(){
        força++;
        System.out.println("Alguém foi mordido ! A força do zumbi "+ nome + " foi parra" + força);

    }
    

}
package Aula7;

public class Zumbi {
    public String nome;
    public double km;
    public double vida;
    public int força;

     public double mostraVida(){
       return this.vida;
    }

    public void morder(){
        força++;
        System.out.println("Alguém foi mordido ! A força do zumbi "+ nome + " foi parra" + força);

    }

    public void tranfereVida(Zumbi zumbiAlvo, double quantia){
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
    

}
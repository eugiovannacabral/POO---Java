package Aula10;

public class Kart {
    public String nome;
    public Piloto piloto;
    public Motor motor;

    public Kart(){
        this.motor = new Motor();
        this.motor.mostraInfo();

        motor.cilindradas = "50";
        motor.velocidadeMaxima = 100;

        motor.mostraInfo();

    }

    public void pular(){
        System.out.println("Kart pulou");
    }

    public void soltarTurbo(){
        System.out.println("Soltou turbo");
    }

    public void fazerDrift(){
        System.out.println("fez drift");
    }
}

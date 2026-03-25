package Aula4;

import java.util.Random;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);

        int x = rand.nextInt(10) + 1; //gera um numero aleatorio entre 1 e 10 e salva em x

        System.out.println("Qual número foi sorteado:");
        int numero = teclado.nextInt();

        while(x != numero){

            if(numero > x){
                System.out.println("Seu número foi maior que o sorteado\n");
            }else{
                System.out.println("Seu número foi menor que o sorteado!\n");
            }
            System.out.println("Qual número foi sorteado?");
            numero = teclado.nextInt();

            teclado.close();
        }
    }
}

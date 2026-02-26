package Aula2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos lanches foram consumidos na primeira hora ?");
        int primeira_hora = teclado.nextInt();

        System.out.println("Quantos lanches foram consumidos na segunda hora ?");
        int segunda_hora = teclado.nextInt();

        System.out.println("Quantos lanches foram consumidos na terceira hora ?");
        int terceira_hora = teclado.nextInt();

        int soma = primeira_hora + segunda_hora + terceira_hora;
        double media = soma/3;

        System.out.println("Total de lanches consumidos: " + soma);
        System.out.println("Media de lanches consumidos: " + media);


    }
}

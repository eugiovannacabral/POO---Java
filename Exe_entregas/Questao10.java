package Exe_entregas;

import java.util.Scanner;

public class Questao10 { 
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos ingressos inteiros você comprou?");
        int quantInt = teclado.nextInt(); 
        teclado.nextLine();

        System.out.println("Qual foi o valor de cada um?");
        String valorIntTexto = teclado.nextLine();
        valorIntTexto = valorIntTexto.replace(",", ".");
        double valorInt = Double.parseDouble(valorIntTexto);


        System.out.println("Quantos ingressos meia você comprou?");
        int quantMeia = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Qual foi o valor de cada um?\n");
        String valorMeiaTexto = teclado.nextLine();
        valorMeiaTexto = valorMeiaTexto.replace(",", ".");
        double valorMeia = Double.parseDouble(valorMeiaTexto);


        double totalInt = quantInt * valorInt;
        double totalMeia = quantMeia * valorMeia;
        double totalSessao = totalInt + totalMeia;

        double media = (totalInt + totalMeia) / 13;

        System.out.println("----------------------------------------");
        System.out.println(totalInt);
        System.out.println(totalMeia);
        System.out.println(totalSessao);
        System.out.println(media);
    }
}
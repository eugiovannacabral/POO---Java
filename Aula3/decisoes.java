package Aula3;

import java.util.Scanner;

public class decisoes {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int qtd = teclado.nextInt();

        if(qtd >= 5)
            System.out.println("Qtd é maior do que 5");
        else if(qtd > 3){
            System.out.println("Qtd é maior do que 3");
        }
        else{
            System.out.println("Qtd é menor do que 3");
        }

        teclado.close();
    }
}

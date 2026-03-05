package Aula3;

import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args){

         Scanner teclado = new Scanner(System.in);

         int n = teclado.nextInt();

         switch (n){
            case 10:
                System.out.println("Sala I-6");
                break;
            case 20:
                System.out.println("Sala I-6");
                break;
            case 30:
                System.out.println("Sala I-5");
                break;
            default:
                System.out.println("Você não está em sala enhuma ");
                break;
         }

         teclado.close();
    }

}

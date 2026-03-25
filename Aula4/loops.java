package Aula4;

import java.util.Scanner;

public class loops {
    
    public static void main(String[] args) {
        Scanner inatel = new Scanner(System.in);

        System.out.println("Entre com a Quantidade:");
        int qtd = inatel.nextInt();

        /*while(qtd > 0){
            System.out.println(qtd);
            qtd--; 

        }*/ //Verifica primeira e executa depois

        /*do{
            System.out.println(qtd);
            qtd--;
        }while(qtd>0);*/

        /*for(int i = 0; i < 10; i++){
            System.out.println(i);
        }*/

        /*for(int i = qtd; i > 0; i--){
            System.out.println(i);
        }*/

        int [] vetor ={1,3,6,2};

        for(int numero: vetor){
            System.out.println(numero);
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        inatel.close();
    }
    
}

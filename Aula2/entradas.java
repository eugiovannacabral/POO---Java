package Aula2;
import java.util.Locale;
import java.util.Scanner;

public class entradas {
    public static void main(String[] args) {
        
        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);//obdece os padrões desse pais

        System.out.println("Entre com a sua idade:");
        int idade = teclado.nextInt();

        System.out.println("Entre com a sua altura:");
        double altura = teclado.nextDouble();

        teclado.nextLine();//Limpa o buffer, captura o enter a mais o /n

        System.out.println("Entre com o seu nome:");
        String nome = teclado.nextLine();

        System.out.printf("%d, %.2f, %s \n", idade, altura, nome);

        teclado.close();

    }
}

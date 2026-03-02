package Aula3;

import java.util.Scanner;

// O nome da classe DEVE ser "main" se o arquivo for "main.java"
public class ex4 { 
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota NPA:");
        int npa = teclado.nextInt();

        if (npa >= 60) {
            System.out.println("Você passou!!!");
        } else {
            System.out.println("Vishhh você não estudou com atenção :(");
            System.out.println("Qual é a sua nota de NP3?");
            int np3 = teclado.nextInt();

            int nfa = (npa + np3) / 2;

            if (nfa >= 50) {
                // Usei a concatenação simples (+) para evitar erros com o %d
                System.out.println("Sua nota da NFA foi " + nfa + ". Agora sim hein! Mas na próxima vez passe direto!");
            } else {
                System.out.println("Sua nota de NFA foi " + nfa + ". Amigão, você vai precisar fazer de novo.");
            }
        }

        teclado.close();
    }
}
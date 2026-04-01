package Aula15;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner teclado = new Scanner(System.in)










        campo[linhaBomba][colunaBomba] = -1;

        System.out.println("Campo Minado");

        while(jogadas < 3){
            System.out.println("Entre com a posição da linha: ");
            int linha = teclado.nextInt();

            System.out.println("Entre com a posição da coluna: ");
            int coluna = teclado.nextInt;

            if(campo[linha][coluna] == -1){
                System.out.println("BOOOOOm!");
            }
        }
    }
}

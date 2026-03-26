package Aula12;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.setNome("Sarah");
        cliente.setCpf("111.111.111-00");
       // cliente.endereco = "Rua 2";

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Guilia");

        conta.addCliente(cliente);
        conta.addCliente(cliente1);

        //conta.listaClientes();

        //Trabalhando com arrays multiplos

        int[][] matriz = new int[5][5];
        
        //5 linhas e 5 colunas respectivamente
        //o segundo for executa todas as colunas de 1 linha

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i + j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                 if(i == j){
                    matriz[i][j]= 1;
                }
                else
                    matriz [i][j] = 0;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

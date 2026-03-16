package Aula6;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();//criando um objeto
        //var conta = new Conta(); -> tipo implicito de criação de obj

        conta.saldo = 700;
        conta.nomeDono = "Gabriela";
        conta.agencia = 0001;
        conta.limite = 400;


        conta.deposita( 600);

        System.out.println("Na conta do(a)" + conta.nomeDono + "tem R$" + conta.saldo);

        conta.saque(400);

        System.out.println("Na conta" + conta.nomeDono + "tem R$" + conta.saldo);

        System.out.println("--------------------");


        Conta conta2 = new Conta();
        conta2.saldo = 700;
        conta2.nomeDono = "Ester";

        conta2.deposita( 290);

        System.out.println("Na conta do(a)" + conta2.nomeDono + "tem R$" + conta2.saldo);

        conta2.saque(40);

        System.out.println("Na conta" + conta2.nomeDono + "tem R$" + conta2.saldo);





    }
}

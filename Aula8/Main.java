package Aula8;

public class Main {
    public static void main(String[] args){
        Conta conta = new Conta(); //criando um objeto
        Cliente cliente = new Cliente();

        cliente.nome = "Sara";
        cliente.cpf = "111.111.111-00";
        cliente.endereco = "Rua das Flores,55";


        //conta.titular = cliente;//recebe uma var que precisa ser do tipo CLIENTE para acessar os atributos dela
        //se removesse essa linha de cima vai dar nulo, dá um erro de referencia por conta da não agregação
        //conta.saldo = 1000000;

        //System.out.println(conta.titular.nome);
        //System.out.println(cliente.nome);

        //System.out.println("Cliente "+ conta.titular.nome + );


        Empresa empresa = new Empresa();
    }

        
}

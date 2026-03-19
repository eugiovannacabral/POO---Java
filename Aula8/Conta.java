package Aula8;

public class Conta {
    //var acessiveis ao longo de todo projeto
    public double saldo;
    public double limite;
    public int numero;
    
    public Cliente titular; //criando uma variavel do tipo cliente

    //Metodos
    public void deposita(double quantia){
        this.saldo = this.saldo + quantia; // ou this.saldo += quantia; // this ajuda a encontar um metodo da classe
    }

    public void saque(double quantia){
        this.saldo -=  quantia;
    }

    public void transferir(Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}

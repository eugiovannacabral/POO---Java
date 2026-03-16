package Aula6;

public class Conta {
    //var acessiveis ao longo de todo projeto
    public double saldo;
    public double limite;
    public int agencia;
    //public int numeroConta;
    public String nomeDono;


    //Metodos
    public void deposita(double quantia){
        this.saldo = this.saldo + quantia; // ou this.saldo += quantia; // this ajuda a encontarr um metodo da classe
    }

    public void saque(double quantia){
        this.saldo -=  quantia;
    }

    public void transferir(Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }














}

package Aula6;

public class Conta {
    //var acessiveis ao longo de todo projeto
    public double saldo;
    public double limite;
    public int agencia;
    public int numeroConta;


    //Metodos
    public void deposita(double quantia){
        this.saldo = this.saldo + quantia; // ou this.saldo += quantia;
    }

    public void saca(double quantia){
        this.saldo = this.saldo - quantia;
    }
















}

package Aula12;

public class Conta {
    //var acessiveis ao longo de todo projeto
    private double saldo;
    private double limite;
    private int numero;
    private Cliente clientes[] = new Cliente[5];

    //this referencia a instancia/barra obj criado, ele aoonta para os atributos da classe que estao sendo usados por esse obj 

    //Metodos
    public void deposita(double quantia){
        this.saldo = this.saldo + quantia; // ou this.saldo += quantia; // this ajuda a encontarr um metodo da classe
    }

    public void saque(double quantia){
        if(this.saldo > quantia)
            this.saldo -= quantia;
    }

    public void transferir(Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }

    public void addCliente(Cliente cliente){

        for(int i = 0; i < this.clientes.length; i++){
            if(this.clientes[i] == null){
                this.clientes[i] = cliente;
                break;
            }
        }
    }

    public void listaClientes(){
        for(Cliente cliente: this.clientes){
            if(clientes != null){
                System.out.println(cliente.getNome());
        }
    }
}
}

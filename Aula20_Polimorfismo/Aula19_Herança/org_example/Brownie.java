package Aula20_Polimorfismo.Aula19_Herança.org_example;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhodeCompras(){
        System.out.println("Adcionando no carrinho de compras um "+ this.nome);
        System.out.println();
    }

    public void calculaValorTotalCompra(){

        double total_compra = 0;
        total_compra += this.preco;
        System.out.println("Calculando o valor total da compra de um "+ this.nome + ": " + total_compra);
        System.out.println();
        /* 
        Brownie[] brownies = new Brownie[2];
        brownies[0] = bwcafe;
        brownies[1] = bwnutella;

        for(int i = 0; i < brownies.length; i++){
            brownies[i].mostraInfo();
            brownies[i].calculaValorTotalCompra();
        }
            */
    }

    public void mostraInfo(){
        System.out.println();
        System.out.println("Nome do produto escolhido: "+ this.nome);
        System.out.println("Preço do produto escolhido: "+ this.preco);
        System.out.println("Sabor do produto escolhido: "+ this.sabor);
    }
}

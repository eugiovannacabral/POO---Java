package Aula20_Polimorfismo.Aula19_Herança.org_example;

public class BrownieNutella extends Brownie{

    //Construtor -> Você quer garantir que o objeto já nasce com valores válidos
    //ou para facilitar a criação do objeto

    //Use this quando:tem conflito de nomes (obrigatório) quer deixar o código mais claro
    //this.nome → atributo da classe /nome → parâmetro do construtor

    public BrownieNutella(String nome, double preco, String sabor){
        super(nome, preco, sabor); //pois esses atributos estao vindo da superclasse Brownie
    }

    public void adicionaNutella(){
        System.out.println(this.nome + "- Adicionando mais Nutella");
    }


    public void addCarrinhodeCompras(){
        System.out.println("Adcionando no carrinho de compras um "+ this.nome);
        System.out.println();
    }
}

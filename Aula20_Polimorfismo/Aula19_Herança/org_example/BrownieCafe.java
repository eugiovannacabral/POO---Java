package Aula20_Polimorfismo.Aula19_Herança.org_example;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println(this.nome + "- Adicionando mais café");
    }
}

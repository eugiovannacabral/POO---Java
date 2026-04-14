package Aula19_Herança.org_example;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println(this.nome + "- Adicionando mais Doce de Leite");
    }
}
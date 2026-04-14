package Aula18;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){ //METODO CONSTRUTOR executa algo que vai acontecer apenas 1 vez para cada instancia ou seja para cada objeto
        System.out.println("Criando instância de Pessoa com 2 parâmetros");
        this.nome = nome;
        this.idade = idade;
    } 

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Criando instância de Pessoa com 1 parâmetros");
    } 

    public Pessoa(){ 
        System.out.println("Criando instância de Pessoa sem parâmetros");
    } 

    
}

package Aula18;

public class Main {
    public static void main(String[] args) {

        //Exemplos para Construtores
       /*  Pessoa pessoa = new Pessoa("Layla", 100);
        Pessoa pessoa1 = new Pessoa("Ronnie Wesley", 100);
        Pessoa pessoa2 = new Pessoa();*/

        //static trabalha com vars da classe e nao da instancia

        Bloco b1 = new Bloco();
        Bloco b2 = new Bloco();
        System.out.println(b2.getNumBlocos());
        System.out.println(b1.getNumBlocos());
        System.out.println(Bloco.getNumBlocos());

       // String.format(null, args)

    }
}





















































































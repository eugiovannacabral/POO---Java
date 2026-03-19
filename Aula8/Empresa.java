package Aula8;

public class Empresa {
    public String nome;

    public Empresa(){ //COMPOSIÇÃO 
        Departamento departamento = new Departamento(); //é dependente da empresa
        departamento.nome = "Engenharia";

        System.out.println(departamento.nome);
    }
}

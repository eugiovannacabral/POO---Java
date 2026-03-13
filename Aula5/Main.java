package Aula5;

public class Main {
    
    public static void main(String[] args) {
        Pessoa Layla = new Pessoa();
        
        Layla.nome = "Layla Victória";
        Layla.idade = 85;

        Layla.falar();

        Professor Poo = new Professor();

        Poo.idade = 44;
        Poo.nome = "Marcos";
        Poo.disciplina = "Matemática";
        Poo.falar();
        Poo.ministraAula();

        Engenheiro Eng = new Engenheiro();

        Eng.categoria = "Software";
        Eng.idade = 21;
        Eng.nome = "Giovanna";
        Eng.disciplina = "Resistência dos materiais";

        Eng.falar();
        Eng.ministraAula();
        Eng.constroi();

        Monitor monitor = new Monitor();
        
    }
}

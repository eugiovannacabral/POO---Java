package Aula5;

public class Professor extends Pessoa { //HERANÇA
    String disciplina;

    void ministraAula(){
        System.out.println("Aula de "+ disciplina);
    }


    String leciona(){
        return "Ensina " + disciplina;
    }

    @Override
    public void falar(){
        System.out.println("Mudei de disciplina");
    }






}

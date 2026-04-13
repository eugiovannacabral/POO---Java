package Exe_entregas.br_inatel_poo;

import Exe_entregas.br_inatel_poo.Turmas.Turma;
import Exe_entregas.br_inatel_poo.Turmas.Aluno;

public class Main {
    public static void main(String[] args) {
        Turma turma1 = new Turma();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.setNome("Vinícius");
        aluno2.setNome("Layla");
        aluno3.setNome("Mayara");
        
        aluno1.setMatricula("1028");
        aluno2.setMatricula("756");
        aluno3.setMatricula("346");

        aluno1.notas[0] = 54;
        
    }
}

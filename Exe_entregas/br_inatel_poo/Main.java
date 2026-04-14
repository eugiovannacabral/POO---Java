package Exe_entregas.br_inatel_poo;

import Exe_entregas.br_inatel_poo.Turmas.Turma;
import Exe_entregas.br_inatel_poo.Turmas.Aluno;

public class Main {
    public static void main(String[] args) {

        Turma turma = new Turma();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        aluno1.setNome("Vinícius");
        aluno2.setNome("Layla");
        aluno3.setNome("Mayara");
        
        aluno1.setMatricula("1028");
        aluno2.setMatricula("756");
        aluno3.setMatricula("346");

        aluno1.adcionarNota(77);
        aluno2.adcionarNota(56);
        aluno2.adcionarNota(100);
        
        turma.listarAlunos();
        System.out.println();
        turma.buscarMelhorAluno();

    }
}

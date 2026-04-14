package Exe_entregas.br_inatel_poo.Turmas;

public class Turma {
    private int quantidadeAlunos;
     private Aluno alunos[] = new Aluno[3];

    public void adicionarAluno(Aluno aluno){
        for(int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
            quantidadeAlunos ++;
        }
    }

    public void listarAlunos(){
        for(Aluno aluno: this.alunos) { //for each
            if (aluno != null){
                System.out.println(aluno.getNome()); //por agregação ele tem acesso aos atributos de Aluno
            }else{
                System.out.println("Esse aluno não está cadastrado");
            }
                
        }
    }

    public Aluno buscarMelhorAluno(){
        Aluno melhor = null;
        double maior = -1;

        for(Aluno aluno : this.alunos){
            if(aluno != null){  //verificando do aluno atual
                double media = aluno.calculaMedia(); 
                if(media > maior){
                    maior = media;
                    melhor = aluno;
                }
            }
        }

        if(melhor != null){
            System.out.println("Melhor aluno: " + melhor.getNome());
            System.out.println("Média: " + melhor.calculaMedia());
        }else {
        System.out.println("Nenhum aluno cadastrado.");
    }

    return melhor;
}

}
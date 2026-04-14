package Exe_entregas.br_inatel_poo.Turmas;

public class Aluno {
    private String nome;
    private String matricula;
    private double notas[] = new double[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { //vai receber o nome
        this.nome = nome;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void adcionarNota(double nota){
         for(int i = 0; i < this.notas.length; i++){
            if (this.notas[i] == 0) {
                this.notas[i] = nota;
                break;
            }
        }
        
    }

    public double calculaMedia(){
        double soma = 0;
        double media;
       for (double nota : notas) {
            soma += nota;
        }

        media = soma/ notas.length;
        return media;
    }
    

     public void mostraInfo(){
        System.out.println("Boletim do aluno" + nome);
        for (double nota : notas) {
            System.out.println("Nota : "+ nota);
        }
        System.out.println("Média da turma: " + this.calculaMedia());//porque media só é acessivel nesse metodo
        
    }

    
}

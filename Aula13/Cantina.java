package Aula13;

public class Cantina {
    public String nome;
    public Salgado salgados[] = new Salgado[3];

    public void addSalgado(Salgado novoSalgado){

        for(int i = 0; i < this.salgados.length; i++){
             if(this.salgados[i] == null){
                this.salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo(){
        for(int i = 0; i < this.salgados.length; i++){
            System.out.println("Salgados do dia: " + this.salgados[i].nome );
        }
    }
}

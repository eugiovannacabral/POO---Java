package Aula18;

public class Bloco {
    private static int numBlocos; // o static faz com que todos vao ver esse dado que é comum a minha classe 

    public Bloco(){
        numBlocos++;
    }

    public static int getNumBlocos(){
        return numBlocos;
    }
}

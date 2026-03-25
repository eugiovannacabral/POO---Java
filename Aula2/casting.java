package Aula2;

public class casting {
    public static void main(String[] args) {
        //Casting processo de converter a variavel de um tipo para outro, feito manualmente
        //Promocao é a conversao automatica
        
        int idade = 21;
        long idade1 = idade;//Conversao por promocao

        int idade2 = (int)idade1;//Conversao casting, pois o tamanho da memoria em int é maior que a em long ent a conversão precisa ser explicita

        float pi = 3.1415f;
        double pi2 = pi; //conversão por promocao pois o double tem mais espaço para armazenar o float
        float pi3 = (float) pi2;

        int ano = Integer.parseInt("2026");

        //char-> String;

        char letra = 'F';
        String letra1 = String.valueOf(letra);
        String letra2 = Character.toString(letra);
        String letra3 = "" + (letra);

        //String -> char
        String faculdade = "Inatel";
        char primeiraLetra = faculdade.charAt(0);

        
    }
}

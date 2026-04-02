package Aula16;
import Aula16.Matematica.*;
import Aula16.Matematica2.*;

public class Main {
    public static void main(String[] args) {
        
        // .Matematica.Matematica mat = new Aula16.Matematica.Matematica();

        // Aula16.Matematica2.Matematica2 mat2 = new Aula16.Matematica2.Matematica2();

        //outro jeito de fazer só que importando para ficar mais facil, logo o jeito de criar objs fica igual faziasse antes

        Matematica mat1 = new Matematica();
        Matematica mat2 = new Matematica();

        System.out.println(mat1.soma(1,2));
        System.out.println(mat1.divisao(2,0));
        System.out.println(mat1.divisao(10,2));

        mat2.soma(1,2);
        mat2.divisao(2,1);
        mat2.divisao(10,2);
    }
}

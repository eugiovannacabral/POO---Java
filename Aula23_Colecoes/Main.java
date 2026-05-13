package Aula23_Colecoes;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List listaGenerica = new ArrayList<>();
        listaGenerica.add(1);
        listaGenerica.add("Inatel");
        listaGenerica.add(10.55f);
        listaGenerica.add(true);
    
        listaGenerica.add(listaGenerica.size() - 1, "String");

        System.out.println(listaGenerica);

        int elemento = (int) listaGenerica.get(0);
        int elemento1 = (int) listaGenerica.getFirst;//erro aqui por causa da versao do Java

        List<String> listaString = new ArrayList<String>();

        listaString.add("String");
        listaString.add("Inatel");
        listaString.add("POO");

        String elementoString = listaString.get(2);
        System.out.println(elementoString);

        //percorrer a nossa lista de string
        for(String texto: listaString){
            System.out.println(texto);
        }

        System.out.println("----------------------");
        for(int i=0; i < listaString.size(); i++){
            System.out.println(listaString.get(i));
        }

        listaString.forEach((String texto)->
            
        )};
    
}

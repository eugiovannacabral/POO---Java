public class aula_introducao {
    
    public static void main(String[] args){
        
        /*String nome = "Inatel";
        System.out.println(nome);
        System.out.println(nome.length());//para saber o a quant de caracteres do nome
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.getBytes());
        System.out.println(nome.replace("Inatel", "Instituto"));
        */

        int horas = 3;
        int primeiraHora = 10;
        int segundaHora = 4;
        int terceiraHora = 2;

        int soma = primeiraHora + segundaHora + terceiraHora;
        double media = soma / horas;

        System.out.println("Total: " + soma);
        System.out.println("Média: " + media);
    }
    }
}

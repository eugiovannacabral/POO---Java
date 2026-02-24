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

        /*int horas = 3;
        int primeiraHora = 10;
        int segundaHora = 4;
        int terceiraHora = 2;

        int soma = primeiraHora + segundaHora + terceiraHora;
        double media = soma / horas;

        System.out.println("Total: " + soma);
        System.out.println("Média: " + media);
        */

        int quantInt = 8; //ou coloca 'var' pois este faz inferencia de tipos como se fosse a String em Python
        int quantMeia = 5;

        double valorInt = 30.00;
        double valorMeia = 15.00;

        double totalInt = quantInt * valorInt;
        double totalMeia = quantMeia * valorMeia;
        double totalSessao = totalInt + totalMeia;

        double media = ((totalInt) + (totalMeia)) / 13;

        System.out.println(totalInt);
        System.out.println(totalMeia);
        System.out.println(totalSessao);
        System.out.println(media);
    }
    
}

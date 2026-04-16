package Aula20_Polimorfismo.Aula19_Herança.org_example;

public class Main {
    public static void main(String[] args) {

        BrownieCafe bwcafe = new BrownieCafe("Brownie de Café", 15, "café");
        BrownieNutella bwnutella = new BrownieNutella("Brownie de Nutella", 15, "nutella");


        bwcafe.addCarrinhodeCompras();
        bwnutella.addCarrinhodeCompras();

        bwcafe.mostraInfo();
        bwcafe.adicionaCafe();
        bwcafe.calculaValorTotalCompra();
        

        bwnutella.mostraInfo();
        bwnutella.adicionaNutella();
        bwnutella.calculaValorTotalCompra();

        
        

    }
}

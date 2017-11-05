/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author cabaj_1129591
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dyrektor kelner = new Dyrektor();
        
        builderDanie danieObiadowe = new Obiad();
        kelner.setDanieBuilder(danieObiadowe);
        kelner.constructorDanie();
        Danie obiad = kelner.getDanie();
        System.out.println(obiad.getNazwa() + ": " + obiad.getOpis());
        
        builderDanie danieSniadanie = new Sniadanie();
        kelner.setDanieBuilder(danieSniadanie);
        kelner.constructorDanie();
        Danie sniadanie = kelner.getDanie();
        System.out.println(sniadanie.getNazwa() + ": " + sniadanie.getOpis());
        
        builderDanie danieKolacja = new Kolacja();
        kelner.setDanieBuilder(danieKolacja);
        kelner.constructorDanie();
        Danie kolacja = kelner.getDanie();
        System.out.println(kolacja.getNazwa() + ": " + kolacja.getOpis());
        
    }
    
}

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterndecorator;

/**
 *
 * @author cabaj_1129591
 */
public class PatternDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Osobowy osobowy = new Osobowy();
//        System.out.println(osobowy.opis());
        Marka marka = new Marka(osobowy, "Audi");
        Silnik silnik = new Silnik(marka, "diesel");
//        System.out.println(silnik.opis()); 
        Kolor kolor = new Kolor(silnik, "czarny");
//        System.out.println(kolor.opis());
        Klimatyzacja klimatyzacja = new Klimatyzacja(kolor, "tak");
        System.out.println(klimatyzacja.opis());
        
        
        Osobowy osobowy2 = new Osobowy();
        Marka marka2 = new Marka(osobowy2, "Audi");
        Silnik silnik2 = new Silnik(marka2, "diesel");
        Kolor kolor2 = new Kolor(silnik2, "czarny");
        Klimatyzacja klimatyzacja2 = new Klimatyzacja(kolor2, "tak");
        System.out.println(klimatyzacja2.opis());
    }
    
}

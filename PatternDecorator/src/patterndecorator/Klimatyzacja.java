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
public class Klimatyzacja extends SamochodDecorator {
    Samochod samochod;
    private String klimatyzacja;
    
    Klimatyzacja(Samochod samochod, String klimatyzacja){
        this.samochod = samochod;
        this.klimatyzacja = klimatyzacja;
    }
    
    public String opis(){
        return samochod.opis() + " klimatyzacja " + klimatyzacja + " cena " + cena+3000;
    }
    
}

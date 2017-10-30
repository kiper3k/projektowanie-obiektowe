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
public class Silnik extends SamochodDecorator {
    Samochod samochod;
    private String silnik;
    
    Silnik(Samochod samochod, String silnik){
        this.samochod = samochod;
        this.silnik = silnik;
    }
    
    public String opis(){
        return samochod.opis() + " silnik " + silnik;
    }
}

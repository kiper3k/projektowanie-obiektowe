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
public class Marka extends SamochodDecorator{
    Samochod samochod;
    private String marka;
    
    Marka(Samochod samochod, String marka){
        this.samochod = samochod;
        this.marka = marka;
    }
    
    public String opis(){
        return samochod.opis() + " marka " + marka;
    }
    
}

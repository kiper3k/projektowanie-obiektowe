/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterndecorator;

/**
 *
 * @author kiper
 */
public class Cena extends SamochodDecorator {
    Samochod samochod;
    private double cena;
    
    Cena(Samochod samochod, double cena){
        this.samochod = samochod;
        this.cena = cena;
    }
    
    public String opis(){
        
        return samochod.opis() + " cena " + cena;
    }
}

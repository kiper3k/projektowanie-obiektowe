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
public class Kolor extends SamochodDecorator{
    Samochod samochod;
    private String kolor;
    
    Kolor(Samochod samochod, String kolor){
        this.samochod = samochod;
        this.kolor = kolor;
    }
    
    public String opis(){
        return samochod.opis() + " kolor " + kolor;
    }
    
}

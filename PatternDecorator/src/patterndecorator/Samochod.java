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
public abstract class Samochod {
    protected String nazwa = "nazwa samochodu";
    protected double cena;
    
//    public abstract String opis ();

    public String opis() {
        return nazwa;
    }
    
    
    
}

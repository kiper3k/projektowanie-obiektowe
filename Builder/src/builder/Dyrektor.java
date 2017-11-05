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
public class Dyrektor {
    
    private builderDanie dyrektor;
    
    public void setDanieBuilder(builderDanie drk){
        dyrektor = drk;
    }
    
    public Danie getDanie() {
        return dyrektor.getDanie();
    }
    
    public void constructorDanie(){
        dyrektor.createDanie();
        dyrektor.buildNazwa();
        dyrektor.buildOpis();
    }
}

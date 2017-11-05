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
abstract class builderDanie {
    
    protected Danie danie;
    
    public Danie getDanie(){
        return danie;
    }
    
    public void createDanie(){
        danie = new Danie();
    }
    
    public abstract void buildNazwa();
    public abstract void buildOpis();
    
}

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
public class Osobowy extends SamochodDecorator {
    
    Osobowy(){
        this.nazwa = "osobowy";
        this.cena = 40000;
    }
    
    @Override
    public String opis() {
        return nazwa + " cena " + cena;
    }
    
}

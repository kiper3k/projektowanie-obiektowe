/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author cabaj_1129591
 */
public class Ticket {
    
    String name;
    String surname;
    
    int flight_number;
    
    private static Ticket ticket;
    
    public Ticket(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.flight_number = 2;
    }
    
    
    public Ticket getInstance(){
        return Ticket.ticket;
    }
    
    public 

    
}

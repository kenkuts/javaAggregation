/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaggregation;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class Roadie {
    private String name;
    private String role;
    
    public Roadie(String name, String role){
        
        this.name = name;
        this.role = role;
    }
    
    public Roadie(Roadie roadie){
        
        this.name = roadie.name;
        this.role = roadie.role;        
    }
    
    @Override
    public String toString(){
        
        String str = ("\nRoadie Name: " + name +
                      "\nRole: " + role);
        
        return str;
    }
    
}

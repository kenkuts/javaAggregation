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
public class Personnel {
    
    private String name;
    private String role;
    private int idNum;
    
    public Personnel(String name, String role, int idNum){
        
        this.name = name;
        this.role = role;
        this.idNum = idNum;
    }
    
    public Personnel(Personnel personnel){
        
        this.name = personnel.name;
        this.role = personnel.role;
        this.idNum = personnel.idNum;
    }
    
    @Override
    public String toString(){
        
        String str = ("\nName: " + name +
                      "\nRole: " + role +
                      "\nId Number: " + idNum);
        
        return str;
    }
    
}

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
public class JavaAggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("This program creates a concert live event");
        Roadie roadie = new Roadie("Jonh Wick","Manager");
        Artist artist = new Artist("Kaskasde", "Electronic Dance Music",11,30, roadie);
        Personnel personnel = new Personnel("Pat Tillman","Security",8216);
        LiveArena arena = new LiveArena("Madison Square Garden",artist, personnel);
        
        System.out.println(artist);
        System.out.println(arena);
    }
    
}

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
public class LiveArena {
    
    private String name;
    private Artist artist;
    private Personnel personnel;
    private Roadie roadie;
    
    public LiveArena(String name, Artist artist, Personnel personnel, Roadie roadie){
        
        this.name = name;
        this.artist = new Artist(artist);
        this.personnel = new Personnel(personnel);
        this.roadie = new Roadie(roadie);
    }
    
    @Override
    public String toString(){
        
       String str = ("\nArena Name: " + name +
                      "\n" + artist +
                      "\n" + personnel +
                      "\n" + roadie);
        
        return str;
    }
}

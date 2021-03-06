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
public class Artist {
    
    private String name;
    private String genre;
    private int hour;
    private int mins;
    
    public Artist(String name, String genre, int hour, int mins){
        
        this.name = name;
        this.genre = genre;
        this.hour = hour;
        this.mins = mins;
    }
    
    public Artist(Artist artist){
        this.name = artist.name;
        this.genre = artist.genre;
        this.hour = artist.hour;
        this.mins = artist.mins;
    }
        
    @Override
    public String toString(){
        
        String str = ("\nBand/Performer Name: " + name +
                      "\nGenre: " + genre +
                      "\nTime of Performance: " + hour + ":" + mins);
        
        return str;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BlueJai5000
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] names = new String[80];
        int [] scores = new int[80];
        
        try {
            Scanner reader = new Scanner(new File(args[0]));
            
            //Anything that depends on reader ^^
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("File not found in  main method.");
        }
    }
    
    public static void sortStats(String[] player, int[] score, String file){
       
        
        
    }
}
